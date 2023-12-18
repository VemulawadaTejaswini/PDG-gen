import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		BigInteger N = new BigInteger(n);
		BigInteger nine = new BigInteger("9");
		if (N.remainder(nine).equals(BigInteger.ZERO)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
