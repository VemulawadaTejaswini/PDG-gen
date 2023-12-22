import java.util.Scanner;

public class Main {

	static long a, b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextLong();
		b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		System.out.println(b - a + 1 - (calc(c) + calc(d) - calc(lcm(c, d))));

	}

	static long calc(long divide) {
		return b / divide - (a - 1) / divide;
	}

	static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

}
