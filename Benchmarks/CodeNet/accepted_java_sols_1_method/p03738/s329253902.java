import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());

		int ans = a.compareTo(b);

		if (ans < 0) {
			System.out.println("LESS");
		} else if (ans == 0) {
			System.out.println("EQUAL");
		} else {
			System.out.println("GREATER");
		}
	}

}
