import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	static long k;
	static long k_tmp;
	static long a[];
	static long b[];
	static int a_index;
	static int b_index;
	static int count;
	static boolean a_nothing;
	static boolean b_nothing;
	static int n;
	static int m;
	static int ans;

	public static void main(String[] args) {

		n = ni();
		m = ni();
		k = nl();
		k_tmp = k;

		a = new long[n];
		b = new long[m];

		for (int i = 0; i < n; i++) {
			a[i] = nl();
		}
		for (int i = 0; i < m; i++) {
			b[i] = nl();
		}

		a_index = 0;
		b_index = 0;
		count = 0;
		ans = 0;

		a_nothing = false;
		b_nothing = false;

		dfs(true);
		a_index = 0;
		b_index = 0;
		count = 0;
		k = k_tmp;
		dfs(false);

		out(ans);

	}

	static void dfs(boolean isa) {

		if (a_index == n) {
			a_nothing = true;
		} else {
			a_nothing = false;
		}
		if (b_index == m) {
			b_nothing = true;
		} else {
			b_nothing = false;
		}
		if (b_nothing && a_nothing) {
			out(count);
			System.exit(0);
		}

		if (isa && !a_nothing) {
			k -= a[a_index];
			a_index++;
			count++;
		} else if (isa && a_nothing) {
			return;
		}

		if (!isa && !b_nothing) {
			k -= b[b_index];
			b_index++;
			count++;
		} else if (!isa && b_nothing) {
			return;
		}

		if (k < 0) {
			if (ans <= count - 1) {
				ans = count - 1;
			}
			count -= 1;
			if (isa) {
				a_index -= 1;
				k += a[a_index];
			} else {
				b_index -= 1;
				k += b[b_index];
			}
			return;
		}

		dfs(true);
		dfs(false);
	}

	/*
	 * 以下メソッド集
	 */
	static int[] sort(int[] n) {
		Arrays.sort(n);
		return n;
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
