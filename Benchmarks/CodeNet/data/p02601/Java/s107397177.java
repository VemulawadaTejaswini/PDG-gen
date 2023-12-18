
// Submitted By SUbhash Yadav

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc=new FastScanner();
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), k=sc.nextInt();
		if(a<b&&b<c) System.out.println("Yes");
		else {
			int x=0;
			if(a<b) x=0;
		
			else {
				double d= Math.log(1.0*a/b)/Math.log(2.0);
			
				x=(int)Math.ceil(d);
				//System.out.println(x);
				b=b*(int)Math.pow(2, x);
				 if(a==b) {
					 
						x+=1;
						b=2*b;
					}
			}
			
			if(b<c) x=0;
			
			else {
				double d= Math.log(1.0*b/c)/Math.log(2.0);
				//System.out.println(d);
				
				 x+=(int)Math.ceil(d);
				//System.out.println(x);
				c=c*(int)(int)Math.pow(2, (int)Math.floor(d));
				if(b==c) x+=1;
			}
			//System.out.println(a+" "+b+" "+c+" "+x);
			if(x>k) System.out.println("No");
			else System.out.println("Yes");
			
			
			
			
		}
		
		
		//System.out.println(ans);
		
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
