import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int n = scanner.nextInt();
		    String[] array = new String[n];
		    
		    for(int i = 0; i < n; i++) 
		    {
		    	array[i] = scanner.next();
		    }
		    int matigai = 0;
		    
		    for(int i = 0; i < n - 1; i++) 
		    {
		    	if(array[i].substring(array[i].length() - 1).equals(array[i+1].substring(0,1))) 
		    	{
		    		
		    	}
		    	else 
		    	{
		    		matigai++;
		    	}
		    }
		    for(int i = 0; i < n; i++) 
		    {
		    	for(int j = 0; j < i; j++) 
		    	{
		    		if(array[i].equals(array[j])) 
		    		{
		    			matigai++;
		    		}
		    	}
		    }
		    
		    if(matigai == 0) 
		    {
		    	System.out.println("Yes");
		    }
		    else 
		    {
		    	System.out.println("No");
		    }
		    
		    scanner.close(); }
		  }
