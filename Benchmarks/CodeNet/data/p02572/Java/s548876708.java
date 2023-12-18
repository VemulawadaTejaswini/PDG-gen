

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static long MOD = (int) 1e9 + 7;
	
	static void solve() {
		int n = in.nextInt();
		int[] arr = in.readarr(n);

		
		long sum = 0;
		long[] psums = new long[n + 1];
		for(int i = 0; i < n; i++)
		{
			psums[i + 1] = arr[i] + psums[i];
			psums[i + 1] %= MOD;
		}

		for(int i = 0; i < n; i++)
		{
			if(psums[n] < psums[i + 1]) psums[n] += MOD;
			long curr = (psums[n] - psums[i + 1]) * arr[i];
			curr %= MOD;
			sum += curr;
			sum %= MOD;
			psums[n] -= MOD;
		}
		System.out.println(sum);
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



