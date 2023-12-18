import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			BigInteger a = new BigInteger(scan.next());
			BigInteger b = new BigInteger(scan.next());

			BigInteger c = a.add(b);

			if (ok(a) && ok(b) && ok(c)) {
				System.out.println(c);
			} else {
				System.out.println("overflow");
			}
		}

	}

	private static boolean ok(BigInteger z) {
		return z.toString().length() <= 80;
	}
}