import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class study {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextBigDecimal()) {
				BigDecimal x = sc.nextBigDecimal();

				BigDecimal n = x
						.divide(new BigDecimal("9.8"), RoundingMode.HALF_EVEN)
						.pow(2).multiply(new BigDecimal("4.9"))
						.add(new BigDecimal(5))
						.divide(new BigDecimal(5), 0, RoundingMode.UP);
				System.out.println(n.toPlainString());
			}
		} finally {
			sc.close();
		}
	}
}