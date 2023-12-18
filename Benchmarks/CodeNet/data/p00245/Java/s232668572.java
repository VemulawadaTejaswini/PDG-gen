import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	int R, C;
	int[][] table;

	int[] gain;
	int[] start;
	int[] end;

	int[] totalGain;

	int startR;
	int startC;

	int[][][] item;
	boolean[][][][] vis;

	int[] dr = {0, 1, 0, -1, 0};
	int[] dc = {1, 0, -1, 0, 0};

	void solve() {
		C = sc.nextInt();
		R = sc.nextInt();
		if (R == 0) return;
		table = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				char ch = sc.next().charAt(0);
				if (Character.isDigit(ch)) {
					table[i][j] = (ch - '0');
				} else {
					table[i][j] = -1;
				}
				if (ch == 'P') {
					startR = i;
					startC = j;
				}
			}
		}
		int M = 8;
		int m = sc.nextInt();
		gain = new int[M];
		start = new int[M];
		end = new int[M];
		for (int i = 0; i < m; i++) {
			int id = sc.nextInt();
			gain[id] = sc.nextInt();
			start[id] = sc.nextInt();
			end[id] = sc.nextInt();
		}
		item = new int[R][C][101];
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				if (table[i][j] != -1)
					for (int k = 0; k < 4; k++)
					{
						int ni = i + dr[k];
						int nj = j + dc[k];
						if (isin(ni, nj)) {
							int id = table[i][j];
							for (int t = start[id]; t <= end[id]; t++)
								item[ni][nj][t] |= 1 << table[i][j];
						}
					}
		totalGain = new int[1 << M];
		for (int i = 0; i < M; i++) {
			totalGain[1 << i] = gain[i];
		}
		for (int i = 0; i < M; i++) {
			for (int s = 0; s < 1 << M; s++) {
				if ((s >> i & 1) == 1)
					totalGain[s] += totalGain[s ^ (1<<i)];
			}
		}
		vis = new boolean[R][C][1 << M][101];
		Queue<State> q = new ArrayDeque<State>();
		State init = new State(startR, startC, item[startR][startC][0], 0);
		q.add(init);
		init.vis(true);
		int ans = 0;
		while (!q.isEmpty()) {
			State s = q.poll();
			ans = Math.max(ans, totalGain[s.set]);
			if (s.time >= 100) continue;
			for (int k = 0; k < 5; k++) {
				int ni = s.r + dr[k];
				int nj = s.c + dc[k];
				if (isin(ni, nj) && table[ni][nj] == -1) {
					State next = new State(ni, nj, s.set | item[ni][nj][s.time+1], s.time + 1);
					if (!next.vis()) {
						next.vis(true);
						q.add(next);
					}
				}
			}
		}
		out.println(ans);
	}

	class State {
		int r, c, set, time;
		public State(int r, int c, int set, int time) {
			this.r = r;
			this.c = c;
			this.set = set;
			this.time = time;
		}
		boolean vis() {
			return vis[r][c][set][time];
		}
		void vis(boolean b) {
			vis[r][c][set][time] = b;
		}
	}

	boolean isin(int r, int c) {
		return 0 <= r && r < R && 0 <= c && c < C;
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