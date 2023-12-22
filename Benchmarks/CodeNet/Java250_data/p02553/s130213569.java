import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		sc.close();

		List<Long> result = new ArrayList<>();

		result.add(a * c);
		result.add(a * d);
		result.add(b * c);
		result.add(b * d);

		Collections.sort(result);

		System.out.println(result.get(3));
	}
}
