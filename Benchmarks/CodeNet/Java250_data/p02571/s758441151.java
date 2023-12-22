

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		char[] s = in.nextLine().toCharArray();
		char[] t = in.nextLine().toCharArray();
		
		
		int n = s.length;
		int n2 = t.length;
		
		int min = n2;
		for(int i = 0; i < n - n2 + 1; i++)
		{
			int curr = 0;
			int count = 0;
			for(int j = i; j < i + n2; j++)
			{
				if(s[j] != t[count]) curr++;
				count++;
			}
			min = Math.min(curr, min);
		}
		
		System.out.println(min);
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

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}



