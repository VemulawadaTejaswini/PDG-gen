
import java.io.*;
import java.util.*;

import javax.xml.ws.WebFault;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int INF = 100000000;
	
	int[] vx = {1, 0}, vy = {0, 1};
	public void run() {
		while (true) {
			int m = in.nextInt(), n = in.nextInt();
			if (n == 0) break;
			
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++) {
				map[i] = in.next().toCharArray();
			}
			
			int[] node = new int[11];
			int cur = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == '*') {
						node[cur] = i * m + j;
						cur++;
					} else if (map[i][j] == 'o') {
						node[0] = i * m + j;
					}
				}
			}
			node = Arrays.copyOf(node, cur);
			
			int[][] dist = new int[n*m][n*m];
			for (int i = 0; i < n * m; i++) {
				Arrays.fill(dist[i], INF);
			}
			
			for (int y1 = 0; y1 < n; y1++) for (int x1 = 0; x1 < m; x1++) {
				if (map[y1][x1] == 'x') continue;
				int i = y1 * m + x1;
				dist[i][i] = 0;
				for (int d = 0; d < vx.length; d++) {
					int nx = x1 + vx[d], ny = y1 + vy[d];
					int j = ny * m + nx;
					if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
						if (map[ny][nx] == 'X') {
							dist[i][j] = dist[j][i] = INF;
						} else {
							dist[i][j] = dist[j][i] = 1;
						}
					}
				}
			}
			
			for (int k = 0; k < n * m; k++) {
				for (int i = 0; i < n * m; i++) {
					for (int j = 0; j < n * m; j++) {
						dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					}
				}
			}
			
			int all = node.length;
			int[][] dp = new int[1<<all][all];
			for (int i = 0; i < (1 << all); i++) Arrays.fill(dp[i], INF);
			dp[1][0] = 0;
			
			for (int i = 1; i < (1 << all); i++) {
				for (int from = 0; from < all; from++) {
					if (((1 << from) & i) == 0 || dp[i][from] == INF) continue;
					for (int to = 0; to < all; to++) if (from != to) {
						if (((1 << to) & i) != 0) continue;
						
						int bit = i | (1 << to);
						dp[bit][to] = Math.min(dp[bit][to], dp[i][from] + dist[node[from]][node[to]]);
//						System.out.println(i + " " + from + " " + dp[i][from] + " -> " + bit + " " + to + " " + dp[bit][to]);
					}
				}
			}
			
			int res = INF;
			for (int i = 1; i < all; i++) {
				res = Math.min(res, dp[(1<<all)-1][i]);
			}
			System.out.println(res == INF ? -1 : res);
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