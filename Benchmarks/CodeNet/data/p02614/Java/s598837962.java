import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = ni();
		int w = ni();
		int k = ni();
		char[][] c = new char[h][w];
		char[][] cTmp;

		for (int i = 0; i < h; i++) {
			c[i] = nc();
		}
		int ans = 0;

		ArrayList<Integer> hlist = new ArrayList<>();
		ArrayList<Integer> wlist = new ArrayList<>();

		// bit全探索
		for (int i = 0; i < 1 << h; i++) {
			for (int i1 = 0; i1 < h; i1++) {
				if ((1 & i >> i1) == 1) {
					hlist.add(i1);
				}
			}

			for (int j = 0; j < 1 << w; j++) {
				for (int j1 = 0; j1 < w; j1++) {
					if ((1 & j >> j1) == 1) {
						wlist.add(j1);
					}
				}

				// 主処理
				cTmp = same(c, h, w);
				for (int q = 0; q < h; q++) {
					if (hlist.contains(q)) {
						for (int y = 0; y < w; y++) {
							cTmp[q][y] = '.';
						}
					}
				}
				for (int q = 0; q < w; q++) {
					if (wlist.contains(q)) {
						for (int y = 0; y < h; y++) {
							cTmp[y][q] = '.';
						}
					}
				}

				if (k == countkuro(cTmp)) {
					ans++;
				}

				wlist = new ArrayList<>();

			}

			hlist = new ArrayList<>();
		}

		out(ans);

	}

	/*
	 * 以下メソッド集
	 */
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

	static double[] sort(double[] r) {
		Arrays.sort(r);
		return r;
	}

	static void debug() {
		out("---");
	}

	static void debug(long a) {
		out("-------");
		out(a);
		out("-------");
	}

	static void debug(String a) {
		out("-------");
		out(a);
		out("-------");
	}

	static long[] sort(long[] n) {
		Arrays.sort(n);
		return n;
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

	static void out(String info) {
		System.out.println(info);
	}

	static void out(int info) {
		System.out.println(info);
	}

	static void out(double info) {
		System.out.println(info);
	}

	static void out(long info) {
		System.out.println(info);
	}

	static void out(char info) {
		System.out.println(info);
	}

	static void out(Object obj) {
		System.out.println(obj.toString());
	}

	static void outn(String info) {
		System.out.print(info);
	}

	static void outn(int info) {
		System.out.print(info);
	}

	static void outn(double info) {
		System.out.print(info);
	}

	static void outn(long info) {
		System.out.print(info);
	}

	static void outn(char info) {
		System.out.print(info);
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
		return (int) Math.min(a, b);
	}
}

class XY {
	int h;
	int c;

	XY(int h, int c) {
		this.h = h;
		this.c = c;
	}
}
