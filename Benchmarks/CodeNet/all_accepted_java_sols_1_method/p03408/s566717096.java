import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    String[] s = new String[N];
		    for(int i = 0; i < N; i++) 
		    {
		    	s[i] = scanner.next();
		    }
		    int M = scanner.nextInt();
		    String[] t = new String[M];
		    for(int i = 0; i < M; i++) 
		    {
		    	t[i] = scanner.next();
		    }
		    int[] count = new int[N];
		    
		    for( int i = 0; i < N; i++ ) 
		    {
		    	for( int j = 0; j < N; j++ ) 
		    	{
		    		if( s[i].equals(s[j]) ) 
		    		{
		    			count[i]++;
		    		}
		    	}
		    	for(int k = 0; k < M; k++) 
		    	{
		    		if( s[i].equals(t[k]) ) 
		    		{
		    			count[i]--;
		    		}
		    	}
		    }
		    int max = count[0];
		    for( int i = 0; i < N; i++ ) 
		    {
		    	if( max < count[i] ) 
		    	{
		    		max = count[i];
		    	}
		    }
		    if( max < 0 ) 
		    {
		    	System.out.println(0);
		    }
		    else 
		    {
		    	System.out.println(max);
		    }
		    scanner.close(); }
		  }