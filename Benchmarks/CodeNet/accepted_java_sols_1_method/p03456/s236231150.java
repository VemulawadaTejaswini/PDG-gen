import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
		    String a = scanner.next();
		    String b = scanner.next();
		    int c = Integer.parseInt(a + b);
		    
		    if( (int)Math.sqrt(c) * (int)Math.sqrt(c) == c ) 
		    {
		    	System.out.println("Yes");
		    }
		    else 
		    {
		    	System.out.println("No");
		    }
		    
		    scanner.close(); }
		  }