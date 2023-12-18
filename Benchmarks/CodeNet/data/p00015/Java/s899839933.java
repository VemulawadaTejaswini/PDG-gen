import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			BigInteger a = new BigInteger(scanner.next());
			BigInteger b = new BigInteger(scanner.next());
			BigInteger c = a.add(b);
			System.out.println(c.toString().length() > 80 ? "overflow" : c);
		}
	}
}