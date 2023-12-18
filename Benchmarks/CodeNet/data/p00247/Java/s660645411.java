import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	int R, C;
	char[][] table;
	int[][] id;
	int[] size;
	int[] by;

	int startR;
	int startC;
	int goalR;
	int goalC;

	void solve() {
		C = sc.nextInt();
		R = sc.nextInt();
		if (R == 0) return;
		table = new char[R][];
		for (int i = 0; i < R; i++) table[i] = sc.next().toCharArray();

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (table[i][j] == 'S') {
					table[i][j] = '.';
					startR = i;
					startC = j;
				}
				if (table[i][j] == 'G') {
					table[i][j] = '.';
					goalR = i;
					goalC = j;
				}
			}
		}

		id = new int[R][C];
		size = new int[144];
		{
			int k = 1;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (table[i][j] == 'X' && id[i][j] == 0) {
						size[k] = calcSize(i, j, k);
						if (size[k] == 1) {
							table[i][j] = '#';
						} else {
							k++;
						}
					}
				}
			}
			size = Arrays.copyOfRange(size, 0, k);
			by = new int[k];

		}

		found = false;
		for (int limit = 1; limit < 144 ;limit++) {
			long s = System.currentTimeMillis();
			dfs(startR, startC, limit);
			long e = System.currentTimeMillis();
			if (found) {
				out.println(limit);
				break;
			}
		}
		if (!found) {
			out.println(-1);
		}

	}

	int[] dr = {0, 1, 0, -1};
	int[] dc = {-1, 0, 1, 0};
	boolean found;
	void dfs(int r, int c, int limit) {
		if (r == goalR && c == goalC) {
			found = true;
			return;
		}
		if (limit == 0) return;
		if (limit < Math.abs(r - goalR) + Math.abs(c - goalC)) return;
		if (found) return;
		char save = table[r][c];
		table[r][c] = '#';
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (isin(nr, nc) && table[nr][nc] != '#') {
				int x = id[nr][nc];
				if (x != 0) {
					by[x] += 2;
					if (by[x] <= size[x]) dfs(nr, nc, limit - 1);
					by[x] -= 2;
				} else {
					dfs(nr, nc, limit - 1);
				}
			}
		}
		table[r][c] = save;
	}

	boolean isin(int r, int c) {
		return 0 <= r && r < R && 0 <= c && c < C;
	}

	int calcSize(int r, int c, int k) {
		int res = 0;
		if (isin(r,c) && table[r][c] == 'X' && id[r][c] == 0) {
			id[r][c] = k;
			++res;
			res += calcSize(r + 1, c, k);
			res += calcSize(r - 1, c, k);
			res += calcSize(r, c + 1, k);
			res += calcSize(r, c - 1, k);
		}
		return res;
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