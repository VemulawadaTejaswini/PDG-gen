import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int A = scanner.nextInt();
		    int B = scanner.nextInt();
		    int C = scanner.nextInt();
		    int D = scanner.nextInt();
		    if( A + B == C + D ) 
		    {
		    	System.out.println("Balanced");
		    }
		    else if ( A + B > C + D )
		    {
		    	System.out.println("Left");
		    }
		    else 
		    {
		    	System.out.println("Right");
		    }
		    scanner.close(); }
		  }