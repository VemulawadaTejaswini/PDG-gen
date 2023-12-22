import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int A = scanner.nextInt();
		    int B = scanner.nextInt();
		    int counter = 0;
		    
		    for(int i = 0; i <= B - A; i++) 
		    {
		    	if( ((A + i) /10000) % 10 == (A + i)% 10 && 
		    			((A + i) /1000) % 10 == ((A + i) /10) % 10 ) 
		    	{
		    		counter++;
		    	}
		    }
		    System.out.println(counter);
		    
		    scanner.close(); }
		  }