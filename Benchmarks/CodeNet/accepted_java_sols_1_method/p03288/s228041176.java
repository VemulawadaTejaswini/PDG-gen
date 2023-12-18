
import java.util.Scanner;


public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int S = scanner.nextInt();
		    if(S < 1200)
		    {
		    	System.out.println("ABC");
		    }
		    else if(1200 <= S && S < 2800)
		    {
		    	System.out.println("ARC");
		    }
		    else 
		    {
		    	System.out.println("AGC");
		    }
		    scanner.close();}
		  }