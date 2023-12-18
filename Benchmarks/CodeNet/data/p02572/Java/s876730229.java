import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		solve();
		out.close();
	}

	static int MOD = (int) (1e9+7);
	static void solve() {
		int n = f.nextInt();
		long[] arr = new long[n];
		long[] prefSum = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = f.nextInt();
			prefSum[i] = arr[i];
		}

		for(int i=1;i<n;i++) {
			prefSum[i] += prefSum[i-1];
		}

		long ans = 0;
		for(int i=0;i<n-1;i++) {
			ans += (((prefSum[n-1] - prefSum[i]) % MOD) * arr[i]) % MOD;
			if(ans >= MOD) {
				ans %= MOD;
			}
		}

		out.println(ans % MOD);
 	}

	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";

			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}