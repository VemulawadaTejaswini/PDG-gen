    import java.util.*;
    import java.io.*;
    import java.math.BigInteger;
     
    public class Main {
     
     
    	
    	public static void main(String[] args)throws IOException
    	{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		PrintWriter out = new PrintWriter(System.out);
    		
    		StringTokenizer st1 = new StringTokenizer(br.readLine());
    		
    		int n = Integer.parseInt(st1.nextToken());
    		int k = Integer.parseInt(st1.nextToken());
    		int q = Integer.parseInt(st1.nextToken());
    		
    		int arr[] = new int[n];
    		
    		for(int i = 0 ; i < q ; i++)
    		{
    			arr[Integer.parseInt(br.readLine())-1]++;
    		}
    		
    		for(int i = 0 ; i < n ; i++)
    		{
    			if(k-(q-arr[i]) > 0)
    			{
    				out.println("Yes");
    			}
    			else
    			{
    				out.println("No");
    			}
    		}
    		
    		
    		out.flush();
    		out.close();
    	}
    	
    	
    	
     
     
    }