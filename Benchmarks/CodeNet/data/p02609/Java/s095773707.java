/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static long solve(String x){
        long count=0;
        BigInteger bi=new BigInteger(x,2);
        BigInteger t=new BigInteger("0");
        while(bi.compareTo(t)==1){
            int div=bi.bitCount();
            BigInteger b1=new BigInteger(""+div);
            bi= bi.remainder(b1);
            count++;
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
	    String bi=sc.next();
	    char ar[]=bi.toCharArray();
	    for(int i=1;i<=n;i++){
	       swap(ar,i-1);
	       String s1=String.valueOf(ar);
	       long ans=solve(s1);
	       System.out.println(ans);
	       swap(ar,i-1);
	    }
		
		
	}
	public static void swap(char a[],int i){
	    if(a[i]=='0') a[i]='1';
	    else a[i]='0';
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
