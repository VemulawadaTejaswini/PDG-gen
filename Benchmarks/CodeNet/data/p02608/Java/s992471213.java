/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
	    int ans[]=new int[n+1];
	    for(int a=1;a<101;a++){
	        for(int b=1;b<101;b++){
	            for(int c=1;c<101;c++){
	                int val=a*a+b*b+c*c+a*b+b*c+a*c;
	                if(val>n) continue;
	                else ans[val]++;
	            }
	        }
	    }
	    for(int i=1;i<=n;i++)
	    System.out.println(ans[i]);
		
		
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
