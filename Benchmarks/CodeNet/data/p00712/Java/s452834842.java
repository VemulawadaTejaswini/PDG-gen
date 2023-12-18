import java.io.IOException;
import java.util.InputMismatchException;
import java.util.TreeMap;

public class Main {
	int a, n;
	Fraction order;
	TreeMap<D, Integer> set;

	class Fraction implements Comparable<Fraction>{
		long numerator;
		long denominator;

		Fraction(long numerator, long denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
			reduce();
		}

		Fraction(long k) {
			this.numerator = k;
			this.denominator = 1;
		}

		Fraction add(Fraction x) {
			long a = this.denominator;
			long b = this.numerator;
			long c = x.denominator;
			long d = x.numerator;
			Fraction res = new Fraction(b*c + a*d, a*c);
			res.reduce();
			return res;
		}

		Fraction sub(Fraction x) {
			long a = this.denominator;
			long b = this.numerator;
			long c = x.denominator;
			long d = x.numerator;
			Fraction res = new Fraction(b*c - a*d, a*c);
			res.reduce();
			return res;
		}

		Fraction multiple(Fraction x) {
			long a = this.denominator;
			long b = this.numerator;
			long c = x.denominator;
			long d = x.numerator;
			Fraction res = new Fraction(b*d, a*c);
			res.reduce();
			return res;
		}

		Fraction devide(Fraction x) {
			long a = this.denominator;
			long b = this.numerator;
			long c = x.denominator;
			long d = x.numerator;
			Fraction res = new Fraction(b*c, a*d);
			res.reduce();
			return res;
		}

		void reduce() {
			long gcd = gcd(numerator, denominator);
			this.numerator /= gcd;
			this.denominator /= gcd;
			if (this.denominator < 0) {
				this.numerator *= -1;
				this.denominator *= -1;
			}
		}

		long gcd(long a,long b) {
			a = Math.abs(a);
			b = Math.abs(b);
			while (a != 0 && b != 0) {
				if (a > b) a %= b;
				else b %= a;
			}
			if (a == 0) return b;
			return a;
		}

		@Override
		public int compareTo(Fraction o) {
			long a = this.numerator;
			long b = this.denominator;
			long c = o.numerator;
			long d = o.denominator;
			if (a*d - b*c > 0) return 1;
			if (a*d - b*c < 0) return -1;
			return 0;
		}

		@Override
		public String toString() {
			String res = "" + numerator;
			if (denominator != 1) res += "/" + denominator;
			return res;
		}
	}

	class D implements Comparable<D>{
		Fraction f;
		int pre;
		int pi;
		int k;

		D(Fraction f, int pre, int pi, int k) {
			this.f = f;
			this.pre = pre;
			this.pi = pi;
			this.k = k;
		}

		@Override
		public int compareTo(D o) {
			if (this.f.compareTo(o.f) != 0)
				return this.f.compareTo(o.f);
			if (this.pre != o.pre)
				return this.pre - o.pre;
			if (this.pi != o.pi)
				return this.pi - o.pi;
			return this.k - o.k;
		}
	}

	int bt(Fraction pre, Fraction sum, int k, int pi) {
		int cmp = sum.compareTo(order);
		if (cmp > 0)
			return 0;
		if (cmp == 0)
			return 1;
		if (n <= k)
			return 0;

		int res = 0;
		int t = (int)pre.denominator;
		for (int i = t; pi*i <= a; i++) {
			Fraction nf = new Fraction(1, i);
			Fraction nsum = sum.add(nf);
			res += bt(nf, nsum, k + 1, pi*i);
		}
		return res;
	}

	int dp(D d) {
		if (set.containsKey(d)) {
			return set.get(d);
		}

		Fraction f = d.f;
		int p = (int)f.numerator;
		int q = (int)f.denominator;
		int pre = d.pre;
		int pi = d.pi;
		int k = d.k;
		if (f.numerator == 0) {
			return 1;
		}
		if (n <= k || a < pi) {
			return 0;
		}

		int res = 0;
		for (int i = pre; q <= p * i; i--) {
			int np = p*i - q;
			int nq = q*i;
			res += dp(new D(new Fraction(np, nq), i, pi*i, k + 1));
		}
		set.put(d, res);
		return res;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if ((p | q | a | n) == 0) {
				break;
			}
			set = new TreeMap<D, Integer>();

//			System.out.println(dp(new D(new Fraction(p, q), a, 1, 0)));
			order = new Fraction(p, q);
			System.out.println(bt(new Fraction(1), new Fraction(0), 0, 1));
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