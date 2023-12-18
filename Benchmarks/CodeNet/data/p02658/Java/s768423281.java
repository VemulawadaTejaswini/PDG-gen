import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		BigInteger result = new BigInteger(sc.next());
		BigInteger max = new BigInteger("10").pow(18);
		for (long i = 1; i < n; i++) {
			String next = sc.next();
			result = result.multiply(new BigInteger(next));
			if (BigInteger.ZERO.equals(result)) {
				break;
			}
		}
		if (max.compareTo(result) < 0) {
			result = new BigInteger("-1");
		}
		System.out.println(result.toString());
	}
}
