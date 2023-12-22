import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int x = scanner.nextInt();
		    int[] array = new int[N];
		    for(int i = 0; i < N; i++) 
		    {
		    	array[i]  =scanner.nextInt();
		    }
		    Arrays.sort(array);
		    
		    int count = 0;
		    int sum = 0;
		    for(int i = 0; i < N; i++) 
		    {
		    	sum = sum + array[i];
		    	count++;
		    	if(sum >= x) 
		    	{
		    		break;
		    	}
		    }
		    if(sum == x) 
		    {
		    	System.out.println(count);
		    }
		    else if (count != 0)
		    {
		    	System.out.println(count - 1);
		    }
		    else 
		    {
		    	System.out.println(0);
		    }
		    scanner.close(); }
		  }