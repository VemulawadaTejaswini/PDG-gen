import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Debt_hell {

	public static void main(String[] args) throws IOException {

		BigDecimal debt = new BigDecimal("100000");
		BigDecimal interest = new BigDecimal("1.05");
		BigDecimal roundUp = new BigDecimal("1000");

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		int inputNo = Integer.parseInt(input.readLine());

		for (int i = 1; i <= inputNo; i++) {
			debt = debt.multiply(interest)
					.divide(roundUp, 0, BigDecimal.ROUND_UP).multiply(roundUp);
		}

		System.out.println(debt);
	}
}