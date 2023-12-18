import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

			int N = in.nextInt(), W = in.nextInt();
			List<Integer> v = new ArrayList<>();
			List<Integer> w = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				int vi = in.nextInt();
				int wi = in.nextInt();
				v.add(vi); w.add(wi);
				int m = in.nextInt();

				int p = 2;
				int tmpv = vi, tmpw = wi;
				while (2*p <= m) {
					p *= 2;
					tmpv *= 2;
					tmpw *= 2;
					v.add(tmpv); w.add(tmpw);
				}
				v.add(vi*(m-p+1));
				w.add(wi*(m-p+1));
			}

			int newN = v.size();

			long[][] dp = new long[newN+1][W+1];

			for (int i = 0; i < newN; i++) {
				for (int j = 0; j <= W; j++) {
					if (j-w.get(i) >= 0) {
						dp[i+1][j] = max(dp[i][j], dp[i][j-w.get(i)] + v.get(i));
					} else {
						dp[i+1][j] = dp[i][j];
					}
				}
			}

			out.println(dp[newN][W]);

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

