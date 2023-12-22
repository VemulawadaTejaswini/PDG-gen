import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String T = "";
		String W;
		String str = "";
		int count = 0;
		
		
		W = as.nextLine();
		W = W.toLowerCase();
	    
	    
	    
	    while(as.hasNext()){                  //EOF?????§??±????????????????????£?????????
	    	
	    	T = as.next();
	    	T = T.toLowerCase();
       
	    	/*if(T == "END_OF_TEXT"){
		    
	    		break;
	    		
	    	}*/
	    	
	    	if(T.indexOf(W) == 0 && T.lastIndexOf(W) == 0){
	    		
	    		count++;
	    		
	    	}
	    
             
        }
	    
	    str = String.valueOf(count);
	    System.out.println(str);

	}

}