import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int M = scanner.nextInt();
		    int X = scanner.nextInt();
		    int[] station = new int[M];
		    int costfor0 = 0;
		    int costforN = 0;
		    
		    for(int i = 0; i < M; i++) 
		    {
		    	station[i] = scanner.nextInt();
		    	if( station[i] < X ) 
		    	{
		    		costfor0++;
		    	}
		    	else 
		    	{
		    		costforN++;
		    	}
		    }
		    System.out.println( Math.min(costfor0, costforN) );
		    scanner.close(); }
		  }