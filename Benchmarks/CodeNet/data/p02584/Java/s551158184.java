import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		//reigai
		if (X == 0) {
			if (K % 2 == 0) {
				System.out.println(Math.abs(0));
				return;
			} else {
				System.out.println(Math.abs(D));
				return;
			}
		}

		if (X < 0) {
			BigInteger a = new BigInteger(X+"").add(new BigInteger(K+"").multiply(new BigInteger(D+"")));
			if (a.compareTo(BigInteger.ZERO) < 0) {
				System.out.println(a.abs());
				return;
			}
			while (X < 0) {
				X = X + D;
				K--;
			}
			if (K % 2 == 0) {
				System.out.println(Math.abs(X));
				return;
			} else {
				System.out.println(Math.abs(X - D));
				return;
			}
		} else if (X > 0) {
			BigInteger a = new BigInteger(X+"").subtract(new BigInteger(K+"").multiply(new BigInteger(D+"")));
			if (a.compareTo(BigInteger.ZERO) > 0) {
				System.out.println(a.abs());
				return;
			}
			while (X > 0) {
				X = X - D;
				K--;
			}
			if (K % 2 == 0) {
				System.out.println(Math.abs(X));
				return;
			} else {
				System.out.println(Math.abs(X + D));
				return;
			}
		}
	}

}
