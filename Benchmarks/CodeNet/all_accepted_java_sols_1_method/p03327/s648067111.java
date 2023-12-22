import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		    String s = scanner.next();
		    int N = Integer.parseInt(s);
		    
		    if(N >= 1000)
		    {
		    	System.out.println("ABD");
		    }
		    else
		    {
		    	System.out.println("ABC");
		    }	
        	scanner.close();}
		  }