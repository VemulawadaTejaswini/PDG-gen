import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}
	static final int MOD = 100000;
	void solve() {
		int R = sc.nextInt();
		int C = sc.nextInt();
		char[][] table = new char[R][C];
		for (int i = 0; i < R; i++) table[i] = sc.next().toCharArray();

		final int SET = 1 << (C-1);
		int[][][] dp = new int[2][2][SET];
		dp[0][0][0] = 1;
		int f = 0;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				fill(dp[1-f][0], 0);
				fill(dp[1-f][1], 0);
				for (int k = 0; k < 2; k++) {
					for (int set = 0; set < SET; set++) {
						int cur = dp[f][k][set];
						if (cur >= MOD) cur %= MOD;
						if (cur != 0) {
//							tr(r, c, k, set, cur);
							final char ch = table[r][c];
							if (ch == 'J' || ch == '?') {
								int nset = (set << 1) & (SET - 1);
								dp[1-f][1][nset] += cur;
							}
							if (ch == 'O' || ch == '?') {
								int nset = (set << 1) & (SET - 1);
								if (k == 1 && c != 0) nset++;
								dp[1-f][0][nset] += cur;
							}
							if (ch == 'I' || ch == '?') {
								boolean ok = !((set >> (C-2) & 1) == 1);
								if (ok) {
									int nset = (set << 1) & (SET - 1);
									dp[1-f][0][nset] += cur;
								}
							}
						}
					}
				}
				f = 1 - f;
			}
		}
		long ans = 1;
		for (int r = 0; r < R; r++) for (int c = 0; c < C; c++) if (table[r][c] == '?')	ans = ans * 3 % MOD;
		for (int set = 0; set < SET; set++) {
			ans -= dp[f][0][set];
			ans -= dp[f][1][set];
		}
		ans = (ans % MOD + MOD) % MOD;
		out.println(ans);
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}