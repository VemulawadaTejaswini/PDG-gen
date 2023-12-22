import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int n = scanner.nextInt();
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    
		    int sum = 0;
		    
		    
		    for(int i = 1; i <= n; i++) 
		    {
		    	int countketa = 0;
		    	int x = i;
		    	while( x != 0 ) 
		    	{
		    		countketa = countketa + x % 10;
		    		x = x / 10;
		    	}
		    	if(a <= countketa && countketa <=b) 
		    	{
		    		sum = sum + i;
		    	}
		    }
		    System.out.println(sum);
		    
		    scanner.close(); }
		  }