import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int difference = 0;
		    
		    int[] array = new int[N];
		    for( int i = 0; i < N; i++ ) 
		    {
		    	array[i] = scanner.nextInt();
		    }
		    Arrays.sort(array);
		    for(int i = 0; i < N; i++) 
		    {
		    	if( i % 2 == 0 ) 
		    	{
		    		difference = difference + array[N - 1 - i];
		    	}
		    	else 
		    	{
		    		difference = difference - array[N - 1 - i];
		    	}
		    }
		    
		    System.out.println(difference);
		    
		    scanner.close(); }
		  }