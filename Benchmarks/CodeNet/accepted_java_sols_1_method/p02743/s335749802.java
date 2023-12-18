import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = BigInteger.valueOf(sc.nextLong());
		BigInteger b = BigInteger.valueOf(sc.nextLong());
		BigInteger c = BigInteger.valueOf(sc.nextLong());
		sc.close();

		BigInteger right = c.subtract(a).subtract(b);
		if (right.compareTo(BigInteger.ZERO) < 0) {
			System.out.println("No");
			return;
		}
		right = right.pow(2);
		BigInteger left = BigInteger.valueOf(4).multiply(a).multiply(b);
		if (left.compareTo(right) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
