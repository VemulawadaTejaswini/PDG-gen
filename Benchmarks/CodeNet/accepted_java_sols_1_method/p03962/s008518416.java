import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();
		    int count = 1;
		    
		    if( b != a ) 
		    {
		    	count++;
		    	if( c != b && c != a) // a !=  b != c != a 
		    	{
		    		count++;
		    	}
		    }
		    else //a=b 
		    {
		    	if( c != b ) 
		    	{
		    		count++;
		    	}
		    }
		    System.out.println(count);
		    
		    
		    scanner.close(); }
		  }