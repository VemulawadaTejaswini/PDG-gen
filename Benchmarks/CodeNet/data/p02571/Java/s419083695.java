import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = n();
		String t = n();
		int l = t.length();
		//		int max = 0;
		//		for (int i = 1; i < l; i++) {
		//			String n = t.substring(0, i);
		//			if (s.contains(n)) {
		//				if (max < i) {
		//					max = i;
		//				}
		//			}
		//		}
		//
		//		for (int i = l; i >= 0; i--) {
		//			String n = t.substring(l - i);
		//			if (s.contains(n)) {
		//				if (max < i) {
		//					max = i;
		//				}
		//			}
		//		}
		//
		//		out(l - max);

		int max = 0;

		for (int i = 0; i <= s.length() - l; i++) {
			String ss = s.substring(i, i + l);
			//debug(ss);
			int count = 0;
			for (int j = 0; j < l; j++) {
				//debug(ss);
				if (ss.substring(j, j + 1).contentEquals(t.substring(j, j + 1))) {
					count++;
				}
			}
			if (max < count) {
				max = count;
			}
		}

		out(l - max);

	}

	/*
	 * 以下メソッド集
	 */

	public static void permutation(String q, String ans) {
		// Base Case
		if (q.length() <= 1) {
			System.out.println(ans + q);
		}
		// General Case
		else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1),
						ans + q.charAt(i));
			}
		}
	}

	static char[][] same(char[][] c, int h, int w) {

		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = c[i][j];
			}
		}
		return a;

	}

	static int countkuro(char[][] c) {

		int count = 0;
		for (char[] cc : c) {
			for (char ccc : cc) {
				if ('#' == ccc) {
					count++;
				}
			}
		}
		return count;
	}

	static void debug() {

		out("---");
	}

	static void debug(Object a) {

		out("-------");
		out(a);
		out("-------");
	}

	static int ketasuu(int n) {

		String str = "" + n;
		return str.length();
	}

	static int account(String str) {

		String target = "AC";
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len - 1; i++) {
			if (target.equals(str.substring(i, i + target.length()))) {
				count++;
			}
		}
		return count;
	}

	static int ni() {

		return sc.nextInt();
	}

	static long nl() {

		return sc.nextLong();
	}

	static double nd() {

		return sc.nextDouble();
	}

	static String n() {

		return sc.next();
	}

	static char[] nc() {

		return sc.next().toCharArray();
	}

	static int kaijo(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * kaijo(n - 1);
		}
	}

	static int fib(int n) {

		return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
	}

	static long lcm(long m, long n) {

		return m * n / gcd(m, n);
	}

	static int lcm(int m, int n) {

		return m * n / gcd(m, n);
	}

	static long gcd(long a, long b) {

		return (b == 0) ? a : gcd(b, a % b);
	}

	static int gcd(int a, int b) {

		return (b == 0) ? a : gcd(b, a % b);
	}

	static void out(Object obj) {
		System.out.println(obj);
	}

	static void outn(Object obj) {
		System.out.print(obj);
	}

	static double max(double d, double e) {

		return Math.max(d, e);
	}

	static long max(long a, long b) {

		return Math.max(a, b);
	}

	static long min(long d, long e) {

		return Math.min(d, e);
	}

	static int min(int a, int b) {

		return Math.min(a, b);
	}
}

class XY {

	int h;
	int w;
	int d;

	XY(int h, int w, int d) {
		this.h = h;
		this.w = w;
		this.d = d;
	}
}
