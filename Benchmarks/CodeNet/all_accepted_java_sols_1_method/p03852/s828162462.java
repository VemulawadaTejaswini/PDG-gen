import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String a = scanner.next();
		    
		    if( a.equals("a") || a.equals("i") || a.equals("u") 
		    						|| a.equals("e") || a.equals("o") )
		    {
		    	System.out.println("vowel");
		    }
		    else 
		    {
		    	System.out.println("consonant");
		    }
		    scanner.close(); }
		  }