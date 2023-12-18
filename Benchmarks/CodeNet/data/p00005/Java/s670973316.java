import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(System.in);

			while (s.hasNextInt()) {
				BigInteger[] num = { s.nextBigInteger(), s.nextBigInteger() };
				Arrays.sort(num, Collections.reverseOrder());
				System.out.println(gcd(num) + " " + lcm(num));
			}

		} finally {
			s.close();
		}

	}

	public static BigInteger gcd(BigInteger[] num) {
		return num[0].gcd(num[1]);
	}

	private static BigInteger lcm(BigInteger[] num) {
		return (num[0].multiply(num[1])).divide(gcd(num));
	}
}