import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((w | h) == 0) {
				return;
			}
			boolean[][] visit = new boolean[h][w];
			int[][] blockW = new int[h - 1][w];
			int[][] blockH = new int[h][w - 1];
			for (int i = 0; i < h * 2 - 1; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < w - 1; j++) {
						blockH[i / 2][j] = sc.nextInt();
					}
				} else {
					for (int j = 0; j < w; j++) {
						blockW[i / 2][j] = sc.nextInt();
					}
				}
			}
			int cost = 1;
			boolean ok = false;
			LinkedList<Info> que = new LinkedList<Info>();
			que.add(new Info(0, 0));
			L: while (!que.isEmpty()) {
				int s = que.size();
				for (int t = 0; t < s; t++) {
					Info now = que.poll();
					visit[now.y][now.x] = true;
					if (now.x == w - 1 && now.y == h - 1) {
						ok = true;
						break L;
					}
					if (inner(now.y + 1, now.x, h, w)
							&& !visit[now.y + 1][now.x]
							&& blockW[now.y][now.x] == 0) {
						que.add(new Info(now.x, now.y + 1));
					}
					if (inner(now.y, now.x + 1, h, w)
							&& !visit[now.y][now.x + 1]
							&& blockH[now.y][now.x] == 0) {
						que.add(new Info(now.x + 1, now.y));
					}
					if (inner(now.y - 1, now.x, h, w)
							&& !visit[now.y - 1][now.x]
							&& blockW[now.y - 1][now.x] == 0) {
						que.add(new Info(now.x, now.y - 1));
					}
					if (inner(now.y, now.x - 1, h, w)
							&& !visit[now.y][now.x - 1]
							&& blockH[now.y][now.x - 1] == 0) {
						que.add(new Info(now.x - 1, now.y));
					}
				}
				cost++;
			}
			System.out.println(ok ? cost : 0);
		}
	}

	class Info {
		int x;
		int y;

		/**
		 * @param x
		 * @param y
		 */
		public Info(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (a[i] >= border)
	int lower_bound(int a[], int border) {
		int l = -1;
		int r = a.length;

		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (border <= a[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		// r = l + 1
		return r;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}
	}
}