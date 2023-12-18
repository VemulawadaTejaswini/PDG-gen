import java.io.IOException;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	int w, h;
	char[][] f;
	int sx, sy, gx, gy;

	class D implements Comparable<D> {
		int x, y;
		int type;
		int min;
		D par;

		D(int x, int y, int type, int min, D par) {
			this.x = x;
			this.y = y;
			this.type = type;
			this.min = min;
			this.par = par;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min)
				return this.min - o.min;
			if (this.type != o.type)
				return this.type - o.type;
			if (this.x != o.x)
				return this.x - o.x;
			if (this.y != o.y)
				return this.y - o.y;
			return 0;
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + ", " + type + ")";
		}
	}

	int dijkstra(int ini) {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		queue.add(new D(sx, sy, ini, 0, null));
		int[] dx = { -1, 0, 0, 1 };
		int[] dy = { 0, -1, 1, 0 };
		boolean[][][] visit = new boolean[w][h][5];

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int x = d.x;
			int y = d.y;
			int type = d.type;
			int min = d.min;

			if (visit[x][y][type]) {
				continue;
			}
			visit[x][y][type] = true;
			if (x == gx && y == gy && type == (ini - 1 + 5) % 5) {
				return min;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
					continue;
				}
				if (f[ny][nx] != '.') {
					int k = f[ny][nx] - '0';
					if ((type + 1) % 5 == k) {
						int ntype = k;
						if (!visit[nx][ny][ntype]) {
							queue.add(new D(nx, ny, ntype, min + 1, d));
						}
					}
				}
				if (!visit[nx][ny][type]) {
					queue.add(new D(nx, ny, type, min + 1, d));
				}
			}
		}
		return -1;
	}

	void print(D d) {
		if (d.par == null) {
			return;
		}
		print(d.par);
		System.out.println(d);
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			f = new char[h][];
			for (int i = 0; i < h; i++) {
				f[i] = sc.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (f[i][j] == 'S') {
						sx = j;
						sy = i;
						f[i][j] = '.';
					}
					if (f[i][j] == 'G') {
						gx = j;
						gy = i;
						f[i][j] = '.';
					}
					if (f[i][j] != '.') {
						f[i][j]--;
					}
				}
			}

			int min = 1 << 20;
			int ini = -1;
			for (int i = 0; i < 5; i++) {
				int tmp = dijkstra(i);
				if (0 <= tmp && tmp < min) {
					min = tmp;
					ini = i;
				}
			}
			if (0 <= ini) {
				System.out.println(++ini + " " + min);
			} else {
				System.out.println("NA");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}