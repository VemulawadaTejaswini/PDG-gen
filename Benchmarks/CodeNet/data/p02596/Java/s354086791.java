import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal k = sc.nextBigDecimal();
		BigDecimal two = new BigDecimal(2);
		if (k.remainder(two) == BigDecimal.ZERO) {
			System.out.println(-1);
		}

		Integer count = 1;
		String seven = "";

		while (true) {

			seven = seven + "7";
			BigDecimal test = new BigDecimal(seven);

			if (test.remainder(k) == BigDecimal.ZERO) {
				System.out.println(count);
				return;
			}

			count++;

		}

	}

}
