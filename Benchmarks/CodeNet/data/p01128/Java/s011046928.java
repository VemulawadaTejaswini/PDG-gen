
import java.awt.geom.Line2D;
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class State implements Comparable<State> {
		double dist;
		int type;

		State(double dist, int type) {
			this.dist = dist;
			this.type = type;
		}

		public int compareTo(State s) {
			return Double.compare(dist, s.dist);
		}

		public String toString() {
			return getClass().getName() + " : " + dist + " " + type;
		}
	}
	
	int calcType(int o, int l) {
		return o ^ l;
	}
	
	double calcDist(double x1, double y1, double x2, double y2) {
		double dx = x1 - x2, dy = y1 - y2;
		return dx * dx + dy * dy;
	}
	
	public void run() {
		int T = in.nextInt();
		while (T-- > 0) {
			double xa = in.nextInt(), ya = in.nextInt(), xb = in.nextInt(), yb = in.nextInt();
			Line2D.Double base = new Line2D.Double(xa, ya, xb, yb);
			int n = in.nextInt();
			double a = (yb - ya) / (xb - xa), b = (ya * xb - yb * xa) / (xb - xa);
			ArrayList<State> list = new ArrayList<State>();
			for (int i = 0; i < n; i++) {
				double nxa = in.nextInt(), nya = in.nextInt(), nxb = in.nextInt(), nyb = in.nextInt();
				int o = in.nextInt(), l = in.nextInt();

				Line2D.Double next = new Line2D.Double(nxa, nya, nxb, nyb);
				
				if (base.intersectsLine(next)) {
					if (nxb != nxa) {
						double c = (nyb - nya) / (nxb - nxa), d = (nya * nxb - nyb * nxa) / (nxb - nxa);
						double x = (d - b) / (a - c), y = (a * d - b * c) / (a - c);
						
//						System.out.println(i + " " + x + " " + y);
						list.add(new State(calcDist(xa, ya, x, y), calcType(o, l)));
					} else {
						double x = nxa;
						double y = x * a + b;

						list.add(new State(calcDist(xa, ya, x, y), calcType(o, l)));
					}
				}
			}
			
			Collections.sort(list);
			
			int res = Integer.MAX_VALUE;
			for (int type = 0; type <= 1; type++) {
				int sum = 0;
				int nowType = type;
				for (State st : list) {
					if (st.type != nowType) {
						sum++;
						nowType ^= 1;
					}
				}
				res = Math.min(res, sum);
			}
			System.out.println(res);
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