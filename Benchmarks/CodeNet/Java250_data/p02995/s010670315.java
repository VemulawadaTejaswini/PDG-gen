import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final long a = sysin.nextLong();
		final long b = sysin.nextLong();
		final long c = sysin.nextLong();
		final long d = sysin.nextLong();
		sysin.close();

		
		long min = a - 1;
		long max = b;
		long lowerDivisor = Math.min(c, d);
		long higherDivisor = Math.max(c, d);
		
		long factor1 = max / lowerDivisor - min / lowerDivisor;
		long factor2 = max / higherDivisor - min / higherDivisor;

		long gcd = gcd(higherDivisor, lowerDivisor);
		long lcm = lowerDivisor * higherDivisor / gcd;
		long dup = max / lcm - min / lcm;

		System.out.println(max - min - factor1 - factor2 + dup);
	}

	private static long gcd(long higher, long lower) {
		return (lower == 0) ? higher : gcd(lower, higher % lower);
	}
}
