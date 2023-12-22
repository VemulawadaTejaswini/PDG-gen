import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String s  = scanner.nextLine();
		    int count = 0;
		    if( s.substring(0, 1).equals("1") ) 
		    {
		    	count = count + 1;
		    }
		    if( s.substring(1, 2).equals("1") ) 
		    {
		    	count = count + 1;
		    }
		    if( s.substring(2, 3).equals("1") ) 
		    {
		    	count = count + 1;
		    }
		    System.out.println(count);
		    scanner.close(); }
		  }