

import java.io.IOException;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long gcd = divide(a, b);

			long lcm = a * b / gcd;
			System.out.println(gcd + " " + lcm);

		}
	}

	public static long divide(long a, long b) {
		long r;
		if (a < b) {
			long temp = b;
			b = a;
			a = temp;
		}
		r = a % b;

		return r == 0 ? b : divide(b, r);
	}

}