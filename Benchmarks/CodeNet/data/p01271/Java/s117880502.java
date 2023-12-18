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
			char[][] f1 = new char[h][w];
			char[][] f2 = new char[h][w];
			int sw1, sh1, sw2, sh2;
			sw1 = sh1 = sw2 = sh2 = 0;
			for (int i = 0; i < h; i++) {
				String in1 = sc.next();
				String in2 = sc.next();
				for (int j = 0; j < w; j++) {
					f1[i][j] = in1.charAt(j);
					f2[i][j] = in2.charAt(j);
					if (f1[i][j] == 'L') {
						sw1 = j;
						sh1 = i;
					}
					if (f2[i][j] == 'R') {
						sw2 = j;
						sh2 = i;
					}
				}
			}
			boolean[][][][] visit = new boolean[h][w][h][w];
			boolean ok = false;
			visit[sh1][sw1][sh2][sw2] = true;
			LinkedList<Pos> que = new LinkedList<Pos>();
			que.add(new Pos(sh1, sw1, sh2, sw2));
			while (!que.isEmpty()) {
				Pos now = que.poll();
				if (f1[now.h1][now.w1] == '%' && f2[now.h2][now.w2] == '%') {
					ok = true;
					break;
				}
				for (int i = 0; i < 4; i++) {
					int nh1 = now.h1 + dy[i];
					int nw1 = now.w1 + dx[i];
					int nh2 = now.h2 + dy[i];
					int nw2 = now.w2 + (dx[i] * -1);
					if (!inner(nh1, nw1, h, w) || f1[nh1][nw1] == '#') {
						nh1 = now.h1;
						nw1 = now.w1;
					}
					if (!inner(nh2, nw2, h, w) || f2[nh2][nw2] == '#') {
						nh2 = now.h2;
						nw2 = now.w2;
					}
					if (!visit[nh1][nw1][nh2][nw2]) {
						visit[nh1][nw1][nh2][nw2] = true;
						que.add(new Pos(nh1, nw1, nh2, nw2));
					}
				}
			}
			System.out.println(ok ? "Yes" : "No");
		}
	}

	class Pos {
		int w1;
		int h1;
		int w2;
		int h2;

		public Pos(int h1, int w1, int h2, int w2) {
			super();
			this.h1 = h1;
			this.w1 = w1;
			this.h2 = h2;
			this.w2 = w2;
		}

		void show() {
			System.out.println(h1 + " " + w1 + " " + h2 + " " + w2);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
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

		char[][] nextChar2dArray(int h, int w) {
			char[][] in = new char[h][w];
			for (int i = 0; i < h; i++) {
				String row = sc.next();
				for (int j = 0; j < w; j++) {
					in[i][j] = row.charAt(j);
				}
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