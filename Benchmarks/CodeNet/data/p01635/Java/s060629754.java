import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		new Main().run();
	}

	void run() {
		int n = sc.nextInt();
		int T = sc.nextInt();
		String fn = sc.next();
		int idx = 0;
		BigInteger sum = BigInteger.ZERO;
		while (true) {
			if (idx >= fn.length())
				break;
			if (fn.charAt(idx + 1) == '^') {
				int d = fn.charAt(idx + 2) - '0';
				BigInteger s = BigInteger.ONE;
				for (int i = 0; i < d; i++)
					s = s.multiply(BigInteger.valueOf(n));
				sum = sum.add(s);
				idx += 3;
			} else {
				idx++;
			}
		}
		// System.out.println(sum * n);
		if (sum.multiply(BigInteger.valueOf(n)).compareTo(
				BigInteger.valueOf(1000 * 1000 * 1000)) > 0) {
			System.out.println("TLE");
		} else {
			System.out.println(sum.multiply(BigInteger.valueOf(n)).toString());

		}
	}
}