
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class Country implements Comparable<Country> {
		int id;
		int next;
		int sum;

		Country(int id, int next, int sum) {
			this.id = id;
			this.next = next;
			this.sum = sum;
		}

		public int compareTo(Country s) {
			if (sum == s.sum) {
				if (next == s.next) return s.id - id;
				return s.next - next;
			}
			return sum - s.sum;
		}

		public String toString() {
			return id + " " + sum;
		}
	}
	
	int[] sum;
	int[][] c;
	TreeSet<Country> tset;
	int MAX = 10010;
	
	public void run() {
		while (true) {
			int n = in.nextInt(), d = in.nextInt();
			if (n == 0) break;
			
			sum = new int[n];
			c = new int[n][];
			tset = new TreeSet<Country>();

			int totalTime = 0;
			for (int i = 0; i < n; i++) {
				int m = in.nextInt();
				totalTime += m;
				c[i] = in.nextIntArray(m);
				for (int j = 0; j < m; j++) {
					sum[i] += c[i][j];
				}
				
				tset.add(new Country(i, m == 0 ? 0 : c[i][0], sum[i]));
			}
			
			int[] cur = new int[n];
			for (int times = 0; times < MAX; times++) {
				Country minCo = tset.first();
				Country candidate = tset.pollLast();
				Country maxCo = tset.last();
				
				int id = candidate.id;
				while (cur[id] < c[id].length && 
						Math.abs(candidate.sum - minCo.sum - c[id][cur[id]]) <= d && 
						Math.abs(maxCo.sum - candidate.sum + c[id][cur[id]]) <= d) {
					candidate.sum -= c[id][cur[id]++];
					totalTime--;
				}
				
				candidate.next = cur[id] < c[id].length ? c[id][cur[id]] : 0;
				tset.add(candidate);
			}
			
			tset.clear();
			System.out.println(totalTime == 0 ? "Yes" : "No");
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