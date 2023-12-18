
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

public class Main {
	InputStream is;

	boolean __FILE_DEBUG_FLAG__ = false;
	String __DEBUG_FILE_NAME__ = "T";

	FastScanner in;
	PrintWriter out;

	/* combination */
	double[][] pascalTriangle(int n) {
		double[][] res = new double[n+1][n+1];
		
		res[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j < i) res[i][j] = (res[i][j] + res[i-1][j]);
				if (j > 0) res[i][j] = (res[i][j] + res[i-1][j-1]);
			}
		}
		
		return res;
	}

	public void solve() {	
		double[][] comb = pascalTriangle(100);
		
		int n = in.nextInt(), m = in.nextInt(), l = in.nextInt();
		double[] P = new double[n];
		int[] T = new int[n];
		int[] V = new int[n];
		for (int i = 0; i < n; i++) {
			P[i] = in.nextInt() / 100.0;
			T[i] = in.nextInt();
			V[i] = in.nextInt();
		}
		
		double[][] restProb = new double[n][m+1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= m; j++) {
				restProb[i][j] = Math.pow(P[i], j) * Math.pow(1.0 - P[i], m - j) * comb[m][j];
			}
		}
		
		for (int next = 0; next < n; next++) {
			double res = 0.0;
			
			for (int i = m; i >= 0; i--) {
				double prob = 1.0;
				for (int other = 0; other < n; other++) {
					if (next == other) continue;
					double sum = 1.0;
					for (int j = 0; j <= m; j++) {
						if ((double)l / V[next] + T[next] * i < (double)l / V[other] + T[other] * j) break;
						sum -= restProb[other][j];
					}
					prob *= sum;
				}
				res += prob * restProb[next][i];
			}
			/*
			for (int other = 0; other < n; other++) {
				if (next == other) continue;
				
				int cur = m;
				double sum = 1.0;
				double prob = 0;
				for (int i = m; i >= 0; i--) {
					while (cur >= 0 && 
							(double)l / V[next] + T[next] * cur >= (double)l / V[other] + T[other] * i) {
						sum -= restProb[next][cur--];
					}
					prob += sum * restProb[other][i];
				}
				System.out.println(prob);
				res *= prob;
			}
			*/
			System.out.println(res);
		}
		
	}

	public void run() {
		if (__FILE_DEBUG_FLAG__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
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