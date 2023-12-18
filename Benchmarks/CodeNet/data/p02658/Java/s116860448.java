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
			PrintWriter out=new PrintWriter(System.out);
	FastScanner fs=new FastScanner();
		int n=fs.nextInt();
	long a[]=new long[n];
	boolean b1=false;
	for(int i=0;i<n;i++)
{
    	a[i]=fs.nextLong();
    	if(a[i]==0)
    	b1=true;
}
	
	long ans=1;
	boolean b=true;
	for(long i:a){
	    ans=ans*i;
	   // out.println(ans);
	    if(ans>(long)Math.pow(10,18)){
	        b=false;
	        break;
	    }
	}
	if(b1)
		out.println("0");
else	if(b)
		out.println(ans);
		else
		out.println("-1");
		out.close();
	
	
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
