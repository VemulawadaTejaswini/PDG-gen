import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger result = null;

		long n = sc.nextLong();
		List<String> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String next = sc.next();
			if ("0".equals(next)) {
				result = BigInteger.ZERO;
				break;
			}
			a.add(next);
		}
		if (result == null) {
			result = new BigInteger(a.get(0));
			BigInteger max = new BigInteger("10").pow(18);
			for (int i = 1; i < n; i++) {
				String next = a.get(i);
				result = result.multiply(new BigInteger(next));
				if (BigInteger.ZERO.equals(result)) {
					break;
				}
			}
			if (max.compareTo(result) < 0) {
				result = new BigInteger("-1");
			}
		}
		System.out.println(result.toString());
	}
}
