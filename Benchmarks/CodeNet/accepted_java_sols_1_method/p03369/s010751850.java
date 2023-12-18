import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String s = scanner.next();
		    
		    int count  = 0;
		    
		    for(int i = 0; i < 3; i++)
		    {
		    	if(s.substring(i, i + 1).equals("o")) 
		    	{
		    		count++;
		    	}
		    }
		    System.out.println( 700 + 100 * count);
		    scanner.close(); }
		  }