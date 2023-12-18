
import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			long W =in.nextLong();
			int[] v = new int[n];
			long[] w = new long[n];
			for (int i = 0; i < n; i++) {
				v[i] = in.nextInt();
				w[i] = in.nextLong();
			}

			int vsum = Arrays.stream(v).sum();

			long[][] dp = new long[n+1][vsum+1];
			for (int i = 0; i <= n; i++) {
				Arrays.fill(dp[i], INF);
			}

			for (int i = 0; i <= n; i++) {
				dp[i][0] = 0;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= vsum; j++) {
					if (j-v[i] >= 0) {
						dp[i+1][j] = min(dp[i][j], dp[i][j-v[i]] + w[i]);
					} else {
						dp[i+1][j] = dp[i][j];
					}
				}
			}

			long ans = -INF;
			for (int i = 0; i <= vsum; i++) {
				if (dp[n][i] <= W) {
					ans = max(ans, i);
				}
			}
			out.println(ans);

		}

		public static int lowerBound(long[] a, long obj) {
			int l = 0, r = a.length - 1;
			while (r - l >= 0) {
				int c = (l + r) / 2;
				if (obj <= a[c]) {
					r = c - 1;
				} else {
					l = c + 1;
				}
			}
			return l;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

}

