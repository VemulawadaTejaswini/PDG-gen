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

	int[] ax = new int[4];
	int[] ay = new int[4];
	int ans;
	int nextNum;
	int[][] board = new int[4][4];

	void dfs(int r, int c) {
		if (r == 4) {
			ans++;
			return;
		}
		if (c == 4) {
			dfs(r + 1, 0);
			return;
		}
		if (board[r][c] != -1) {
			dfs(r, c+1);
			return;
		}
		for (int i = 0; i < 4; i++) {
			int x1 = r;
			int y1 = c;
			int x2 = r + ax[i];
			int y2 = c + ay[i];
			if (0 <= x2 && x2 < 4 && 0 <= y2 && y2 < 4 && board[x2][y2] == -1) {
				board[x1][y1] = board[x2][y2] = nextNum;
				nextNum++;
				dfs(r, c+1);
				board[x1][y1] = board[x2][y2] = -1;
				nextNum--;
			}
		}
	}

	void solve() {
		for (int i = 0; i < 4; i++) {
			int x = sc.nextInt();
			if (x >= 4) return;
			int y = sc.nextInt();
			if (x < 0) {
				x *= -1;
				y *= -1;
			}
			if (x == 0 && y < 0) {
				y *= -1;
			}
			ax[i] = x;
			ay[i] = y;
		}
		ans = 0;
		nextNum = 0;
		for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) board[i][j] = -1;
		dfs(0, 0);
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