
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	public void run() {
		int n = in.nextInt(), m = in.nextInt();
		
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++) {
			map[i] = in.next().toCharArray();
		}
		
		int[] X1 = new int[26];
		int[] Y1 = new int[26];
		int[] X2 = new int[26];
		int[] Y2 = new int[26];
		for (int c = 'A'; c <= 'Z'; c++) {
			int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == c) {
						if (x1 == -1 && y1 == -1) {
							x1 = j; y1 = i;
						} else {
							x2 = j; y2 = i;
						}
					}
				}
			}
			
			if (x1 != -1 && Math.abs(x1 - x2) + Math.abs(y1 - y2) != 1) {
				if (x1 > x2) {
					int t = x1;
					x1 = x2;
					x2 = t;
					t = y1;
					y1 = y2;
					y2 = t;
				}
				
				X1[c - 'A'] = x1;
				X2[c - 'A'] = x2;
				Y1[c - 'A'] = y1;
				Y2[c - 'A'] = y2;
			}
		}
		
		int res = 0;
		boolean more = true;
		while (more) {
			more = false;
			for (int cc = 'A'; cc <= 'Z'; cc++) {
				int c = cc - 'A';
				if (X1[c] == 0 && Y1[c] == 0 && X2[c] == 0 && Y2[c] == 0) continue;
				
				boolean ok1 = true, ok2 = true;
				if (Y1[c] < Y2[c]) {
					for (int y = Y1[c]; y <= Y2[c]; y++) {
						if (map[y][X1[c]] != '.' && map[y][X1[c]] - 'A' != c) ok1 = false;
						if (map[y][X2[c]] != '.' && map[y][X2[c]] - 'A' != c) ok2 = false;					
					}
					for (int x = X1[c]; x <= X2[c]; x++) {
						if (map[Y1[c]][x] != '.' && map[Y1[c]][x] - 'A' != c) ok2 = false;
						if (map[Y2[c]][x] != '.' && map[Y2[c]][x] - 'A' != c) ok1 = false;
					}
				} else {
					for (int y = Y2[c]; y <= Y1[c]; y++) {
						if (map[y][X1[c]] != '.' && map[y][X1[c]] - 'A' != c) ok1 = false;
						if (map[y][X2[c]] != '.' && map[y][X2[c]] - 'A' != c) ok2 = false;					
					}
					for (int x = X1[c]; x <= X2[c]; x++) {
						if (map[Y1[c]][x] != '.' && map[Y1[c]][x] - 'A' != c) ok2 = false;
						if (map[Y2[c]][x] != '.' && map[Y2[c]][x] - 'A' != c) ok1 = false;
					}					
				}
				if (ok1 || ok2) {
					map[Y1[c]][X1[c]] = '.';
					map[Y2[c]][X2[c]] = '.';
					X1[c] = Y1[c] = X2[c] = Y2[c] = 0;
					more = true;
					res += 2;
				}
			}			
		}
		System.out.println(res);
		
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

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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