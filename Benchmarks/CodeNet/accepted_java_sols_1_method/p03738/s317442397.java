import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			BigInteger a = new BigInteger(sc.nextLine());
			BigInteger b = new BigInteger(sc.nextLine());

			if (a.compareTo(b) > 0) {
				System.out.println("GREATER");
			} else if (a.compareTo(b) == 0) {
				System.out.println("EQUAL");
			} else {
				System.out.println("LESS");
			}

		} finally {
			sc.close();
		}
	}
}