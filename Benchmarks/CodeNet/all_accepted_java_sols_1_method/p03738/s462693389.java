import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			BigInteger a = new BigInteger(scanner.next()), b = new BigInteger(scanner.next());
			System.out.println((a.equals(b) ? "EQUAL" : (a.compareTo(b) < 0) ? "LESS" : "GREATER"));
		}
	}
}
