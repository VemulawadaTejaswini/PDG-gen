import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    String N = sc.next();
	    
	    for (char c : N.toCharArray()) {
	    	if (c == '1') {
	    		System.out.print('9');
	    	} else if (c == '9' ) {
	    		System.out.print('1');
	    	} else {
	    		System.out.print(c);
	    	}
	    }
	    
	    System.out.println();
	    
	}    
}	