import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong()-1;
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();

		long x = a - (a / c) - (a / d) + (a / lcm(c, d));
		long y = b - (b / c) - (b / d) + (b / lcm(c, d));

		System.out.println(y-x);

		//12345 7910 
		//
	}

	private static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}