import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String a = scanner.next();
		    String b = scanner.next();
		    String c = scanner.next();
		    
		    System.out.println(a.substring( 0 , 1 ).toUpperCase() 
		    					+ b.substring( 0 , 1 ).toUpperCase()
		    					+ c.substring( 0 , 1 ).toUpperCase());
		    
		    scanner.close(); }
		  }