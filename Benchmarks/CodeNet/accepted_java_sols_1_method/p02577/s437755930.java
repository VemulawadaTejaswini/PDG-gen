import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal n = sc.nextBigDecimal();
		if (n == BigDecimal.ZERO) {
			System.out.println("Yes");
			return;
		}

		String nn = String.valueOf(n);

		int count = 0;

		for (int i = 0; i < nn.length(); i++) {
			count += Integer.valueOf(nn.substring(i, i + 1));
			count = count % 9;
		}

		if (count % 9 == 0) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");

	}
}