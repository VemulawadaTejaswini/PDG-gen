import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	static final int INF = 1001001001;
	static int[][][] memo = new int[2][32][32];

	static class State implements Comparable<State> {
		int side;
		int h, w;
		int cost;
		public State(int side, int h, int w, int cost) {
			this.side = side;
			this.h = h;
			this.w = w;
			this.cost = cost;
		}
		int ref() {
			return memo[side][h][w];
		}
		void memo(int v) {
			memo[side][h][w] = v;
		}
		public int compareTo(State o) {
			if (cost != o.cost) return cost < o.cost ? -1 : 1;
			return 0;
		}
	}

	int W, H;
	int[][] a;
	char[][] s;

	void solve() {
		W = sc.nextInt();
		H = sc.nextInt();
		if ((W | H) == 0) return;
		a = new int[H][W];
		s = new char[H][W];
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++) {
				char ch = sc.next().toCharArray()[0];
				s[i][j] = ch;
				if (Character.isDigit(ch)) {
					a[i][j] = ch - '0';
				}
			}

//		for (int i = 0; i < H; i++) tr(s[i]);

		for (int i = 0; i < memo.length; i++) for (int j = 0; j < memo[0].length; j++) Arrays.fill(memo[i][j], INF);

		PriorityQueue<State> pq = new PriorityQueue<>();

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (s[i][j] == 'S') {
					{
						State state = new State(0, i, j, 0);
						state.memo(state.cost);
						pq.add(state);
					}
					{
						State state = new State(1, i, j, 0);
						state.memo(state.cost);
						pq.add(state);
					}
				}
			}
		}
		int res = -1;
		while (!pq.isEmpty()) {
			State cur = pq.poll();
//			tr(cur.h, cur.w, cur.cost);
			if (cur.cost != cur.ref()) continue;
			if (s[cur.h][cur.w] == 'T') {
				res = cur.cost;
				break;
			}

			for (int di = -3; di <= 3; di++) {
				for (int dj = -3; dj <= 3; dj++) {
					if (Math.abs(di) + Math.abs(dj) <= 3) {
						int nh = cur.h + di;
						int nw = cur.w + dj;
						if (0 <= nh && nh < H && 0 <= nw && nw < W) {
							if (s[nh][nw] != 'X') {
								if ((cur.side == 0 && cur.w < nw) ||
									(cur.side == 1 && cur.w > nw)) {
									State nxt = new State(1 - cur.side, nh, nw, cur.cost + a[nh][nw]);
									if (nxt.ref() > nxt.cost) {
										nxt.memo(nxt.cost);
										pq.add(nxt);
									}
								}
							}
						}
					}
				}
			}

		}
		out.println(res);
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