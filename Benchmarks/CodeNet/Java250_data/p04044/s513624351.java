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
		int n =ob.nextInt();
		int len = ob.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.next();
		}
		Arrays.parallelSort(arr);
		String ans="";
		for (int i = 0; i < arr.length; i++) {
			ans+=arr[i];
		}
		System.out.println(ans);
	}

} 
