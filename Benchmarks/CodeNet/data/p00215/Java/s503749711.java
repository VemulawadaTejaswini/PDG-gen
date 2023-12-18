import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	int w, h;
	char[][] f;
	int sx, sy, gx, gy;

	class D implements Comparable<D>{
		int x, y;
		int bit;

		D(int x, int y, int bit) {
			this.x = x;
			this.y = y;
			this.bit = bit;
		}

		@Override
		public int compareTo(D o) {
			if (this.bit != o.bit)
				return this.bit - o.bit;
			if (this.x != o.x)
				return this.x - o.x;
			if (this.y != o.y)
				return this.y - o.y;
			return 0;
		}
	}

	int[] dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		queue.add(new D(gx, gy, (1 << 5) - 1));
		int[] dx = {-1, 0, 0, 1};
		int[] dy = {0, -1 ,1, 0};
		int[][][] visit = new int[w][h][1 << 5];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				Arrays.fill(visit[i][j], -1);
			}
		}
		boolean[] flag = new boolean[5];
		int cnt = 0;

		visit[gx][gy][(1 << 5) - 1] = 0;

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int x = d.x;
			int y = d.y;
			int bit = d.bit;
			if (x == sx && y == sy) {
				if (Integer.bitCount(bit) == 1) {
					cnt++;
					if (cnt == 5)
						break;
					/*
					for (int i = 0; i < 5; i++) {
						if (0 < (bit & (1 << i))) {
							flag[i] = true;
						}
					}
					 */
				}
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || w <= nx || ny < 0 || h <= ny) continue;

				if (f[ny][nx] == '.') {
					if (visit[nx][ny][bit] == -1) {
						queue.add(new D(nx, ny, bit));
						visit[nx][ny][bit] = visit[x][y][bit] + 1;
					}
				} else {
					int enm = f[ny][nx] - '0' - 1;
					int min = (enm - 1 + 5) % 5;
					if ((bit & (1 << enm)) == 0) continue;
					if ((bit & (1 << min)) == 0) continue;
					int nbit1 = bit ^ (1 << enm);
					int nbit2 = bit;

					if (visit[nx][ny][nbit1] == -1) {
						queue.add(new D(nx, ny, nbit1));
						visit[nx][ny][nbit1] = visit[x][y][bit] + 1;
					}
					if (visit[nx][ny][nbit2] == -1) {
						queue.add(new D(nx, ny, nbit2));
						visit[nx][ny][nbit2] = visit[x][y][bit] + 1;
					}
				}
			}
			System.gc();
		}

		int min = 1 << 20;
		int minId = -1;
		for (int i = 0; i < 5; i++) {
			if (visit[sx][sy][1 << i] != -1) {
				if (visit[sx][sy][1 << i] < min) {
					min = visit[sx][sy][1 << i];
					minId = i;
				}
			}
		}
		return new int[]{min, minId};
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
				}
			}

			int[] ans = dijkstra();
			if (ans[1] < 0) {
				System.out.println("NA");
			} else {
				System.out.println(++ans[1] + " " + ans[0]);
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