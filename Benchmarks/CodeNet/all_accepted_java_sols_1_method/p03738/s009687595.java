import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		if (A.compareTo(B) == 1) {
			System.out.println("GREATER");
		} else if (A.compareTo(B) == 0) {
			System.out.println("EQUAL");
		} else {
			System.out.println("LESS");
		}
	}

}