import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_signatory_first_name'), firstName)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_signatory_last_name'), lastName)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_email'), email)

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_password'), 'Fov2t8o0SiYFNV8nJ5QpzQ==')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_password'), password)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_name'), companyName)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_form-control btn-log border-grey int__5c974a'), phoneNumber)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    '9', true)


WebUI.click(findTestObject('Object Repository/Page_Register/input_state'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_state'), stateProvince)

if (paymentService == 'true') {
	WebUI.delay(5)
	WebUI.click(findTestObject('Object Repository/Page_Register/input_psa-checkbox'))
	WebUI.delay(5)
	WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))
	
	WebUI.delay(5)
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.click(findTestObject('Object Repository/Page_Register/div_Account successfully created'))
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Register/div_Account successfully created'), 0)
	
	WebUI.closeBrowser()
} else if (paymentService == 'false'){
	WebUI.delay(5)
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))
	
	WebUI.delay(5)
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Register/div_Account successfully created'), 3)
	
	//WebUI.click(findTestObject('Object Repository/Page_Register/div_Account successfully created'))
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.closeBrowser()
}







