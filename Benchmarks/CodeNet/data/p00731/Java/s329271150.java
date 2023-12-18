import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = true;
	static int mi;

	static void solve() {
		for (;;) {
			int w = ir.nextInt();
			int h = ir.nextInt();
			if (w == 0 && h == 0)
				return;
			mi = 1 << 30;
			char[][] a = new char[h][w];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					a[i][j] = ir.next().charAt(0);
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					if (a[i][j] == 'S') {
						for (int k = 0; k < 2; k++)
							dijkstra(i * w + j, k, a);
					}
			out.println(mi == 1 << 30 ? -1 : mi);
		}
	}

	private static int[][] dijkstra(int s, int f, char[][] a) {
		int h = a.length;
		int w = a[0].length;
		int[][] d = new int[h * w][2];
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		for (int i = 0; i < a.length * a[0].length; i++)
			Arrays.fill(d[i], 1 << 29);
		d[s][f] = 0;
		pq.offer(new int[] { s, 0, f });
		while (!pq.isEmpty()) {
			int[] p = pq.poll();
			int from = p[0];
			for (int i = -2; i <= 2; i++) {
				int nx = from / w + i;
				if (!(nx >= 0 && nx < h))
					continue;
				for (int j = 1; j <= 3 - Math.abs(i); j++) {
					int ny = from % w + (2 * p[2] - 1) * j;
					if (!(ny >= 0 && ny < w))
						continue;
					if (a[nx][ny] != 'X' && d[nx * w + ny][p[2] ^ 1] > d[from][p[2]]
							+ ((a[nx][ny] >= '0' && a[nx][ny] <= '9') ? (a[nx][ny] - '0') : 0)) {
						d[nx * w + ny][p[2] ^ 1] = d[from][p[2]]
								+ ((a[nx][ny] >= '0' && a[nx][ny] <= '9') ? (a[nx][ny] - '0') : 0);
						pq.offer(new int[] { nx * w + ny, d[nx * w + ny][p[2] ^ 1], p[2] ^ 1 });
						if (a[nx][ny] == 'T')
							mi = Math.min(mi, d[nx * w + ny][p[2] ^ 1]);
					}
				}
			}
		}
		return d;
	}

	static class Graph extends ArrayList<double[]> {
	}

	public static void main(String[] args) throws Exception {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}

