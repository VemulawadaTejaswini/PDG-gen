import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static BigInteger limit = new BigInteger("1000000000000000000");

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int num = sc.nextInt();
			List<BigInteger> values = new ArrayList<BigInteger>();
			for (int i = 0; i < num; i++) {
				values.add(sc.nextBigInteger());
			}
			Collections.sort(values);

			BigInteger result = BigInteger.ONE;
			for (BigInteger value : values) {
				result = result.multiply(value);

				if (result.equals(BigInteger.ZERO)) {
					System.out.println(0);
					return;
				} else if (limit.compareTo(result) < 0) {
					System.out.println(-1);
					return;
				}
			}

			System.out.println(result.toString());

		} catch (Exception e) {
			System.out.println(-1);
			e.printStackTrace();
		}

	}
}
