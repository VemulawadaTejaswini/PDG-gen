import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int n;
	Point[] p;

	class Point {
		double x, y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	class Line {
		static final double EPS = 1e-12;
		static final double INF = 1e12;

		Point a, b;

		Line(Point a, Point b) {
			this.a = a;
			this.b = b;
		}

		Line(Point a, double slope) {
			this.a = a;
			this.b = new Point(0, this.a.y - slope * this.a.x);
		}

		double getSlope() {
			double dx = a.x - b.x;
			double dy = a.y - b.y;
			if (Math.abs(dx) < EPS) {
				return Double.NaN;
			}
			return dy / dx;
		}

		double getX(double y) {
			double slope = getSlope();
			if (Math.abs(slope) < EPS)
				return Double.NaN;
			return (y - this.a.y - slope * this.a.x) / slope;
		}

		double getY(double x) {
			double slope = getSlope();
			if (Double.isInfinite(slope))
				return Double.NaN;
			return slope * x + this.a.y - slope * this.a.x;
		}
	}

	Point[] cross(Point a, Point b) {
		Line l = new Line(a, b);
		Point mid = new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
		Line k = new Line(mid, -1 / l.getSlope());
		double dx = Math.hypot(a.x - b.x, a.y - b.y) / 2;
		double len = Math.sqrt(1.0 - dx * dx);
		double dy = Math.sqrt((len * len) / (1 + k.getSlope() * k.getSlope()));
		double nx1 = mid.x + dy;
		double ny1 = k.getY(nx1);
		Point p1 = new Point(nx1, ny1);
		double nx2 = mid.x - dy;
		double ny2 = k.getY(nx2);
		Point p2 = new Point(nx2, ny2);
		return new Point[] { p1, p2 };
	}

	int count(Point a, Point b) {
		Point[] c = cross(a, b);
		int max = 0;
		for (int i = 0; i < 2; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (isIn(c[i], p[j])) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}
		return max;
	}

	boolean isIn(Point a, Point b) {
		double dx = Math.abs(a.x - b.x);
		double dy = Math.abs(a.y - b.y);
		double len = Math.hypot(dx, dy);
		return len <= 1;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			p = new Point[n];
			for (int i = 0; i < n; i++) {
				String[] s = sc.next().split(",");
				double x = Double.parseDouble(s[0]);
				double y = Double.parseDouble(s[1]);
				p[i] = new Point(x, y);
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					max = Math.max(max, count(p[i], p[j]));
				}
			}

			System.out.println(max);
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