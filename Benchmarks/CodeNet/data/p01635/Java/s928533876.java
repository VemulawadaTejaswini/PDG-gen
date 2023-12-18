import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		BigInteger n = new BigInteger(sc.next());
		BigInteger T = new BigInteger(sc.next());
		String f = sc.next();

		BigInteger result = new BigInteger("0");
		BigInteger border = new BigInteger("1000000000");

		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) == '^') {
				int exponent = Integer.valueOf(f.charAt(i + 1) - '0');
				result = result.add(n.pow(exponent));
			}
		}
		result = result.multiply(T);
		System.out.println(result.compareTo(border) <= 0 ? result : "TLE");
	}

	public static void main(String[] args) {
		new Main().run();
	}

}