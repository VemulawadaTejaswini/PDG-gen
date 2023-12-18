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
		int cnt;
		D par;

		D(int x, int y, int type, int min, int cnt, D par) {
			this.x = x;
			this.y = y;
			this.type = type;
			this.min = min;
			this.cnt = cnt;
			this.par = par;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min)
				return this.min - o.min;
			if (this.type != o.type) {
				int a = (this.type + 1) % 5;
				int b = (o.type + 1) % 5;
				return a - b;
			}
			if (this.x != o.x)
				return this.x - o.x;
			if (this.y != o.y)
				return this.y - o.y;
			return 0;
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + ", " + type + ", " + min + ", " + cnt + ")";
		}
	}

	D dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		int[] dx = { -1, 0, 0, 1 };
		int[] dy = { 0, -1, 1, 0 };
		boolean[][][][] visit = new boolean[w][h][5][6];

		queue.add(new D(sx, sy, 0, 0, 1, null));
		queue.add(new D(sx, sy, 1, 0, 1, null));
		queue.add(new D(sx, sy, 2, 0, 1, null));
		queue.add(new D(sx, sy, 3, 0, 1, null));
		queue.add(new D(sx, sy, 4, 0, 1, null));

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int x = d.x;
			int y = d.y;
			int type = d.type;
			int min = d.min;
			int cnt = d.cnt;

			if (visit[x][y][type][cnt]) {
				continue;
			}
			visit[x][y][type][cnt] = true;
			if (x == gx && y == gy && cnt == 5) {
				return d;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
					continue;
				}
				if (f[ny][nx] != '.' && cnt < 5) {
					int ntype = f[ny][nx] - '0';
					if ((type + 1) % 5 == ntype) {
						if (!visit[nx][ny][ntype][cnt]) {
							queue.add(new D(nx, ny, ntype, min + 1, cnt + 1, d));
						}
					}
				}
				if (!visit[nx][ny][type][cnt]) {
					queue.add(new D(nx, ny, type, min + 1, cnt, d));
				}
			}
		}
		return null;
	}
	
	void print(D d) {
		if (d == null) {
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

			D d = dijkstra();
			if (d != null) {
				int a = (d.type + 2) % 5;
				int b = d.min;
				System.out.println(a + " " + b);
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