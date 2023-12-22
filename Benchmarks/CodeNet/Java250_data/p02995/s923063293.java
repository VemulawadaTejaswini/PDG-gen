import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long a = sc.nextLong();
		long b = sc.nextLong();
		int c = sc.nextInt();
		int d = sc.nextInt();
		long cd = lcm(c, d);
		long cnum, dnum, cdnum, ans;
		cnum = b / c - (a - 1) / c;
		dnum = b / d - (a - 1) / d;
		cdnum = b / cd - (a - 1) / cd;
		ans = b - a + 1 - cnum - dnum + cdnum;
		System.out.println(ans);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	private static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

}
