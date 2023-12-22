import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static String I = "IMPOSSIBLE";
	public static String B = "Bad";
	public static String G = "Good";
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = ni();
		int b = ni();

		if (a >= 13) {
			out(b);

		} else if (a <= 12 && a >= 6) {
			out(b / 2);
		} else {
			out(0);
		}

	}

	/*
	 * 以下メソッド集
	 */
	static int ni() {
		return sc.nextInt();
	}

	static long nl() {
		return sc.nextLong();
	}

	static String n() {
		return sc.next();
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
}