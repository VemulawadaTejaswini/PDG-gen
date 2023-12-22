

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) 
	{
		String s = in.nextLine();
		solve(s);
	}
	
	static void solve(String ss)
	{
		String [] s = ss.split("");
		int largest = -1;
		int curr = 0;
		for(int i = 0; i < s.length; i++)
		{
			if(s[i].equals("R"))
				curr++;
			else
			{
				largest = Math.max(largest, curr);
				curr = 0;
			}
		}
		largest = Math.max(largest, curr);
		System.out.println(largest);
	}
	
	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}



