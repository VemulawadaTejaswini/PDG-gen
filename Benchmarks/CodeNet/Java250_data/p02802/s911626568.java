// Working program with FastReader
import java.io.BufferedReader; 

import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.lang.*;
public class Main
{ 
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 

	long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n=ob.nextInt(),t=ob.nextInt();
		boolean   arr[] = new boolean[n+1];
		long p[] = new long[n+1];
		long count=0;
		for (int i1 = 0; i1 < t; i1++) {
			int k = ob.nextInt();
			String s = ob.next();
			if(!arr[k] && s.compareTo("AC")==0) {
				arr[k]=true;
				count++;
			}
			else if(!arr[k]) {
				p[k]++;
			}

		}
		long p1=0;
		for (int i = 1; i < p.length; i++) {
			if(arr[i]) {
				p1+=p[i];
			}
		}
		System.out.println(count+" "+p1);
		
	}
} 
