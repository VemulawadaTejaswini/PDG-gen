import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    
		    if( a < 0 && 0 < b ) 
		    {
		    	System.out.println("Zero");
		    }
		    else if( a == 0 || b == 0 ) 
		    {
		    	System.out.println("Zero");
		    }
		    else if( 0 < a ) 
		    {
		    	System.out.println("Positive");
		    }
		    else 
		    {
		    	if( Math.abs(b - a) % 2 == 0 ) 
		    	{
		    		System.out.println("Negative");
		    	}
		    	else 
		    	{
		    		System.out.println("Positive");
		    	}
		    }
		    
		    scanner.close(); }
		  }