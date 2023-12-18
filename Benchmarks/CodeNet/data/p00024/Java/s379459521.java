import java.math.BigDecimal;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextBigDecimal()) {

				BigDecimal v = new BigDecimal(sc.next());
				BigDecimal t = v.divide(new BigDecimal("9.8"),
						BigDecimal.ROUND_DOWN);
				BigDecimal y = t.pow(2).multiply(new BigDecimal("4.9"));
				BigDecimal n = (y.add(new BigDecimal(5)).divide(new BigDecimal(
						5))).setScale(0, BigDecimal.ROUND_UP);

				System.out.println(n.toPlainString());

			}

		} finally {
			sc.close();
		}
	}

}