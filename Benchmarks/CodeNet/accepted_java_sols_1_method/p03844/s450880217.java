import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int A = scanner.nextInt();
		    String a = scanner.next();
		    int B = scanner.nextInt();
		    
		    if( a.equals("+") ) 
		    {
		    	System.out.println(A + B);
		    }
		    else 
		    {
		    	System.out.println(A - B);
		    }
		    scanner.close(); }
		  }