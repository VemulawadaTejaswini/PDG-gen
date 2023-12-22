
import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt();
		int[] arr = in.readarr(n);
		
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(i + 1 < n)dp[i + 1] = Math.min(dp[i] + (Math.abs(arr[i] - arr[i + 1])), dp[i + 1]);
			if(i + 2 < n)dp[i + 2] = Math.min(dp[i] + Math.abs(arr[i] - arr[i + 2]), dp[i + 2]);
		}
		
		System.out.println(dp[n - 1]);
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
			int[] temp = new int[abc];
			for (int i = 0; i < abc; i++)
				temp[i] = nextInt();
			return temp;
		}
	}
}
