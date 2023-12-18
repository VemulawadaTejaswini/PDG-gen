
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int[] vx = {-1, 0, 1, 0};
	int[] vy = {0, -1, 0, 1};
	
	Queue<Integer> q = new LinkedList<Integer>();
	boolean[][][][] vis = new boolean[50][50][50][50];
	
	int getKey(int rx, int ry, int lx, int ly) {
		return 1000000 * rx + 10000 * ry + 100 * lx + ly;
	}
	
	boolean inside(int x, int y, int n, int m) {
		return 0 <= x && x < m && 0 <= y && y < n;
	}
	
	public void run() {
		while (true) {
			int m = in.nextInt(), n = in.nextInt();
			if (n == 0 && m == 0) break;
			
			for (int i = 0; i < 50; i++) for (int j = 0; j < 50; j++) for (int k = 0; k < 50; k++) {
				Arrays.fill(vis[i][j][k], false);
			}
			q.clear();
			char[][] rin = new char[n][];
			char[][] len = new char[n][];
			int rsx = -1, rsy = -1, lsx = -1, lsy = -1;
			int rgx = -1, rgy = -1, lgx = -1, lgy = -1;
			
			for (int i = 0; i < n; i++) {
				len[i] = in.next().toCharArray();
				rin[i] = in.next().toCharArray();
				for (int j = 0; j < m; j++) {
					if (rin[i][j] == '%') {
						rgx = j; rgy = i;
					} else if (rin[i][j] == 'R') {
						rsx = j; rsy = i;
					}
					if (len[i][j] == '%') {
						lgx = j; lgy = i;
					} else if (len[i][j] == 'L') {
						lsx = j; lsy = i;
					}
				}
			}
			vis[rsx][rsy][lsx][lsy] = true;
			q.add(getKey(rsx, rsy, lsx, lsy));
			while (!q.isEmpty()) {
				int next = q.poll();
				int ly = next % 100;
				next /= 100;
				int lx = next % 100;
				next /= 100;
				int ry = next % 100;
				next /= 100;
				int rx = next % 100;
								
				for (int d = 0; d < vx.length; d++) {
					int nrx = rx + vx[d], nry = ry + vy[d];
					int nlx = lx - vx[d], nly = ly + vy[d];
					
					if (inside(nlx, nly, n, m) && inside(nrx, nry, n, m)) {
						if (rin[nry][nrx] == '#') {
							if (len[nly][nlx] == '#') {
								continue;
							} else {
								nry = ry;
								nrx = rx;
							}
						} else {
							if (len[nly][nlx] == '#') {
								nly = ly;
								nlx = lx;
							} 
						}
						if (vis[nrx][nry][nlx][nly]) continue;
						vis[nrx][nry][nlx][nly] = true;
						if (!((nrx == rgx && nry == rgy) || (nlx == lgx && nly == lgy))) {									
							q.add(getKey(nrx, nry, nlx, nly));
						}								
					}
				}
			}
			out.println(vis[rgx][rgy][lgx][lgy] ? "Yes" : "No");
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