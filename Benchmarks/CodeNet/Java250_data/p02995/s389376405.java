import java.util.Scanner;

public class Main {
	static  long A, B, C, D;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b, c, d;
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		d = sc.nextLong();

		long ans = f(b, c, d) - f(a - 1, c, d);
		System.out.println(ans);
	}

	static long f(long x, long c, long d) {
		long res = x;
		res -= x / c;
		res -= x / d;
		res += x / lcm(c, d);
		return res;
	}

	static long lcm(long a, long b) { return a / gcd(a, b) * b; }
	static long gcd(long m, long n) {
		if (m < n) return gcd(n, m);
		if (n == 0) return m;
		return gcd(n, m % n);
	}
}