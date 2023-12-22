
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    String S = sc.next();
	    
	    
	    String T = S.substring(0,n/2);
	    String U = S.substring(n/2);
	    
	   // System.out.println(T); 
	   // System.out.println(U);
	    
	    if(n % 2 == 1) {
	    	System.out.println("No");
	    } else {
	    	if(T.equals(U)) {
	    		System.out.println("Yes");
	    	} else {
	    		System.out.println("No");
	    	}
	    }

	}

}