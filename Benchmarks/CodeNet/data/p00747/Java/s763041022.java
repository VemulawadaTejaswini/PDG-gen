
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int INF = 1000000000;
	
	class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	int[] vx = {-1, 0, 0, 1};
	int[] vy = {0, -1, 1, 0};
	public void run() {
		while (true) {
			int m = in.nextInt(), n = in.nextInt();
			if (m == 0) break;
			
			int[][] wall = new int[n*2-1][m*2-1];
			for (int i = 0; i < n * 2 - 1; i++) {
				Arrays.fill(wall[i], -1);
				int start = i % 2 == 0 ? 1 : 0;
				for (int j = start; j < m * 2 - 1; j += 2) {
					wall[i][j] = in.nextInt();
				}
			}
			
			int[][] dist = new int[n][m];
			for (int i = 0; i < n; i++) Arrays.fill(dist[i], INF);
			
			dist[0][0] = 1;
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(0, 0));
			while (!q.isEmpty()) {
				Point p = q.poll();
				
				for (int d = 0; d < vx.length; d++) {
					int wx = p.x * 2 + vx[d], wy = p.y * 2 + vy[d];
					if (wx >= 0 && wx < 2 * m - 1 && wy >= 0 && wy < 2 * n - 1 && wall[wy][wx] == 0) {
						int nx = p.x + vx[d], ny = p.y + vy[d];
						if (dist[ny][nx] > dist[p.y][p.x] + 1) {
							dist[ny][nx] = dist[p.y][p.x] + 1;
							q.add(new Point(nx, ny));
						}
					}
				}
			}
			
			System.out.println(dist[n-1][m-1] == INF ? 0 : dist[n-1][m-1]);
		}
		out.close();
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

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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