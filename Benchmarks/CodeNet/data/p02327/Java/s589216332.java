

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
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

			int h = in.nextInt(), w = in.nextInt();
			int[][] mat = new int[h][w];
			int[][] dp = new int[h][w+1];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int c = in.nextInt();
					if (i == 0 && c == 0) {
						dp[i][j] = 1;
					}
					mat[i][j] = c;
				}
			}

			for (int i = 0; i < w; i++) {
				for (int j = 1; j < h; j++) {
					if (mat[j][i] == 0) {
						dp[j][i] += dp[j-1][i] + 1;
					}
				}
			}


			long ans = 0;
			for (int i = 0; i < h; i++) {
				Deque<P> s = new ArrayDeque<>();

				for (int j = 0; j < w+1; j++) {
					P p = new P(dp[i][j], j);

					if (s.isEmpty()) {
						s.push(p);
					} else {
						if (s.peek().h <= dp[i][j]) {
							s.push(p);
						} else {
							int r = j;
							int l = s.peek().pos;
							while (!s.isEmpty() && s.peek().h > dp[i][j]) {
								ans = Math.max(ans, s.peek().h * (r - l));

								s.pop();
								if (!s.isEmpty() && s.peek().h > dp[i][j]) {
									l = s.peek().pos;
								}
							}
							s.push(new P(dp[i][j], l));
						}
					}
				}
			}

			out.println(ans);
		}

		class P {
			int h;
			int pos;

			public P(int h, int pos) {
				super();
				this.h = h;
				this.pos = pos;
			}
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

