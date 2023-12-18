import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    
		    if(a == 1) 
		    {
		    	if( b == 1 ) 
		    	{
		    		System.out.println("Draw");
		    	}
		    	else 
		    	{
		    		System.out.println("Alice");
		    	}
		    }
		    else 
		    {
		    	if( b == 1) 
		    	{
		    		System.out.println("Bob");
		    	}
		    	else 
		    	{
		    		if(a < b)
		    		{
		    			System.out.println("Bob");
		    		}
		    		else if( a == b) 
		    		{
		    			System.out.println("Draw");
		    		}
		    		else 
		    		{
		    			System.out.println("Alice");
		    		}
		    	}
		    }
		    
		    scanner.close(); }
		  }