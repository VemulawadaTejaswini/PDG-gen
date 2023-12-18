
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		BigDecimal total = BigDecimal.ZERO;

		for (int i = 0; i < n; i++) {

			String amountStr = sc.next();
			BigDecimal amount = new BigDecimal(amountStr);
			String unit = sc.next();

			if (unit.equals("JPY")) {
				total = total.add(amount);
			}
			if (unit.equals("BTC")) {
				total = total.add(amount.multiply(new BigDecimal(380000.0)));
			}

		}

		System.out.println(total);

	}

}
