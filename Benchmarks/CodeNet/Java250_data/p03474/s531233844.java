import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    String s = scanner.next();
		    
		    int count = 0;
		    
		    for(int i = 0; i < s.length(); i++) 
		    {
		    	if(s.substring(i, i+1).equals("-")) 
		    	{
		    		count++;
		    	}
		    }
		    
		    
		    if(count == 1) 
		    {
		    	if(s.indexOf("-") == a) 
		    	{
		    		System.out.println("Yes");
		    	}
		    	else 
		    	{
		    		System.out.println("No");
		    	}
		    }
		    else 
	    	{
	    		System.out.println("No");
	    	}
			
		    scanner.close(); }
		  }