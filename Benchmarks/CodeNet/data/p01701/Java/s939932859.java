import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	class Fraction {
		int numerator;
		int denominator;

		Fraction(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
			reduce();
		}

		Fraction(int k) {
			this.numerator = k;
			this.denominator = 1;
		}

		Fraction add(Fraction x) {
			int a = this.denominator;
			int b = this.numerator;
			int c = x.denominator;
			int d = x.numerator;
			Fraction res = new Fraction(b*c + a*d, a*c);
			res.reduce();
			return res;
		}

		Fraction sub(Fraction x) {
			int a = this.denominator;
			int b = this.numerator;
			int c = x.denominator;
			int d = x.numerator;
			Fraction res = new Fraction(b*c - a*d, a*c);
			res.reduce();
			return res;
		}

		Fraction multiple(Fraction x) {
			int a = this.denominator;
			int b = this.numerator;
			int c = x.denominator;
			int d = x.numerator;
			Fraction res = new Fraction(b*d, a*c);
			res.reduce();
			return res;
		}

		Fraction devide(Fraction x) {
			int a = this.denominator;
			int b = this.numerator;
			int c = x.denominator;
			int d = x.numerator;
			Fraction res = new Fraction(b*c, a*d);
			res.reduce();
			return res;
		}

		void reduce() {
			int gcd = gcd(numerator, denominator);
			this.numerator /= gcd;
			this.denominator /= gcd;
			if (this.denominator < 0) {
				this.numerator *= -1;
				this.denominator *= -1;
			}
		}

		int gcd(int a,int b) {
			a = Math.abs(a);
			b = Math.abs(b);
			if(a<b){a^=b;b^=a;a^=b;}
			return b!=0?gcd(b,a%b):a;
		}

		public String toString() {
			String res = "" + numerator;
			if (denominator != 1) res += "/" + denominator;
			return res;
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			char[] s = sc.next().toCharArray();
			if (s[0] == '#') {
				break;
			}
			int id = 0;
			int[] a = new int[20];
			for (int i = 0; i < s.length; i++) {
				if (s[i] == 'n') {
					a[id++] = 0;
					i += 4;
				} else {
					a[id++] = 1;
					i += 3;
				}
			}

			Fraction ans;
			if (a[id - 1] == 0) {
				ans = new Fraction(0);
			} else {
				ans = new Fraction(90);
			}

			int tmp = 1 << 1;
			for (int i = id - 2; 0 <= i; i--) {
				Fraction f = new Fraction(90, tmp);
				if (a[i] == 0) f.numerator *= -1;
				ans = ans.add(f);
				tmp = tmp << 1;
			}

			System.out.println(ans);
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