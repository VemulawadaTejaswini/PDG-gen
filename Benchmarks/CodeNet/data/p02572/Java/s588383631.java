import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		n=Integer.parseInt(br.readLine());
		String brr[]=br.readLine().split(" ");
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=Long.parseLong(brr[i]);
		}
        long sum[] = new long[n]; 
        sum[n - 1] = ar[n - 1]; 
        for (int i = n - 2; i >= 0; i--)  
            sum[i] = sum[i + 1] + ar[i];  
        long res = 0;
        for (int i = 0; i < n - 1; i++)  
            res += (sum[i + 1] * ar[i]); 
        System.out.println((long)(res%(1e9+7)));
    }
	catch(Exception e){}
}}