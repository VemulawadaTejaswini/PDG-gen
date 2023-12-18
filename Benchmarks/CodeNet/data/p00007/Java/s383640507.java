import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {
	
	public static BigDecimal INTEREST_RATE = new BigDecimal("0.05");
	
	public static void main(String... args) {
		int n = Integer.parseInt(args[0]);
		BigDecimal baseDebt = new BigDecimal(100000);
		BigDecimal debt = calc(baseDebt, n);
		System.out.println(debt.intValue());
	}
	
	public static BigDecimal calc(BigDecimal debt, int n) {
		if (n <= 0) {
			return debt;
		}
		BigDecimal interest = debt.multiply(INTEREST_RATE);
		BigDecimal afterDebt = debt.add(interest).setScale(-3, RoundingMode.UP);
		return calc(afterDebt, --n);
	}
}