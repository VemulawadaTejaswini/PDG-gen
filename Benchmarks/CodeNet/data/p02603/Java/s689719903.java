
// Submitted By SUbhash Yadav

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;


public class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		int a[]=sc.readArray(n);
         long ans=1000;
         int i = 0;
         int valley = a[0];
         int peak = a[0];
        // int maxprofit = 0;
         while (i < a.length - 1) {
             while (i < a.length - 1 && a[i] >= a[i + 1])
                 i++;
             
             valley = a[i];
             while (i < a.length - 1 && a[i] <= a[i + 1])
                 i++;
             peak = a[i];
             
             int x=(int)(ans/valley);
             ans=ans%valley;
             ans+=x*peak;
            
         }
        System.out.println(ans);
		
		
		}
		static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}
}
