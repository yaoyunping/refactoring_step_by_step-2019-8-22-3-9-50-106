public class Test {
	   
	   @Test
	    public void should_input_age_20_return_true_when_call_checkDriver() {
	        //given
	    	Driver driver = new Driver(20);
	    	Police police = new Police();
	        //when
	    	
	    	boolean res = police.checkDriver(driver);
	        //then
	    	assertEquals("true", res);
	    }

}
