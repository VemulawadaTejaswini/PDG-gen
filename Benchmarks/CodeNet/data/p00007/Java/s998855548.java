package volume0_0007;

import java.math.BigDecimal;

class Debt_hell {

	public static void main(String[] args) {

		BigDecimal debt = new BigDecimal("100000");
		BigDecimal interest = new BigDecimal("1.05");

		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			debt = calcDebt(debt, interest);
		}

		System.out.println(debt);
	}

	private static BigDecimal calcDebt(BigDecimal debt, BigDecimal interest) {

		BigDecimal roundUp = new BigDecimal("1000");

		return debt.multiply(interest).divide(roundUp, 0, BigDecimal.ROUND_UP)
				.multiply(roundUp);
	}
}