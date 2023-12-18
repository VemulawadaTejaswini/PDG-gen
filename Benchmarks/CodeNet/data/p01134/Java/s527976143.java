
import java.awt.geom.Line2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	
	private final int SORT_TYPE_X = 1;
	private final int SORT_TYPE_Y = 2;
	
	private int points_sort_type = -1;
	private double EPS = 1e-9;
	
	double dadd(double a, double b) {
		if (Math.abs(a + b) < EPS * (Math.abs(a) + Math.abs(b))) return 0;
		return a + b;
	}
	
	class SortTypeUndefinedException extends Exception {
		
	}
	
	class Point implements Comparable<Point> {
		double x;
		double y;
		
 		Point(double x, double y) {
 			this.x = x;
 			this.y = y;
		}
		
		Point add(double sx, double sy) {
			return new Point(dadd(x, sx), dadd(y, sy));
		}
		
		Point add(Point p) {
			return add(p.x, p.y);
		}
		
		Point sub(double sx, double sy) {
			return new Point(dadd(x, -sx), dadd(y, -sy));			
		}
		
		Point sub(Point p) {
			return sub(p.x, p.y);
		}
		
		Point mult(double k) {
			return new Point(x * k, y * k);
		}
		
		double dot(Point p) {
			return dadd(x * p.x, y * p.y);
		}

		double det(Point p) {
			return dadd(x * p.y, y * p.x);
		}
				
		double sin(Point p) {
			double cosVal = cos(p);
			return Math.sqrt(1 - cosVal * cosVal);
		}
		
		double cos(Point p) {
			double res = dot(p) / (abs() * p.abs());
			if (res > 1) return res - EPS;
			if (res < -1) return res + EPS;
			return res;
		}
		
		double abs() {
			return Math.sqrt(dadd(x * x, y * y));
		}
		
		public boolean equals(Point p) {
			return dadd(x, -p.x) == 0 && dadd(y, -p.y) == 0;
		}
		
		public int compareTo(Point s) {
			try {
				if (equals(s)) return 0;
				switch (points_sort_type) {
				case SORT_TYPE_X :
					if (x == s.x) return Double.compare(y, s.y);
					return Double.compare(x, s.x);
				case SORT_TYPE_Y :
					if (y == s.y) return Double.compare(x, s.x);
					return Double.compare(y, s.y);
				default :
					throw new SortTypeUndefinedException();
				}
			} catch (SortTypeUndefinedException e) {
				e.printStackTrace();
				System.exit(1);
			}
			
			return -1;
		}

		public String toString() {
			return "(" + x + ", " + y + ")]";
		}
	}
	
	Point calcIntersection(Line2D.Double l1, Line2D.Double l2) {
		if (!l1.intersectsLine(l2)) return null;
		
		double a1 = 0, b1 = 0, a2 = 0, b2 = 0;
		if (l1.x1 == l1.x2) {
			a2 = (l2.y1 - l2.y2) / (l2.x1 - l2.x2);
			b2 = (l2.x1 * l2.y2 - l2.y1 * l2.x2) / (l2.x1 - l2.x2);
			return new Point(l1.x1, a2 * l1.x1 + b2);
		} else {
			a1 = (l1.y1 - l1.y2) / (l1.x1 - l1.x2);
			b1 = (l1.x1 * l1.y2 - l1.y1 * l1.x2) / (l1.x1 - l1.x2);
		}
		
		if (l2.x1 == l2.x2) {
			a1 = (l1.y1 - l1.y2) / (l1.x1 - l1.x2);
			b1 = (l1.x1 * l1.y2 - l1.y1 * l1.x2) / (l1.x1 - l1.x2);
			return new Point(l2.x1, a1 * l2.x1 + b1);
		} else {
			a2 = (l2.y1 - l2.y2) / (l2.x1 - l2.x2);
			b2 = (l2.x1 * l2.y2 - l2.y1 * l2.x2) / (l2.x1 - l2.x2);
		}
		
		double px = (b2 - b1) / (a1 - a2);
		double py = (a1 * b2 - a2 * b1) / (a1 - a2);
		return new Point(px, py);
	}
	
	public void solve() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			HashSet<Point> hash = new HashSet<Point>();
			Line2D.Double[] lines = new Line2D.Double[n];
			
			int res = 1;
			for (int i = 0; i < n; i++) {
				int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
				lines[i] = new Line2D.Double(x1, y1, x2, y2);
				int sum = 1;
				for (int j = 0; j < i; j++) {
					Point intersection = calcIntersection(lines[i], lines[j]);
					if (intersection == null) continue;
					
					if (hash.contains(intersection)) continue;
					sum++;
					hash.add(intersection);
				}
				res += sum;
			}
			System.out.println(res);
		}
	}	
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
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
				map[i] = nextIntArray(m);
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
				map[i] = nextLongArray(m);
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
				map[i] = nextDoubleArray(m);
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