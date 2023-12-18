import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int datasetRows = sc.nextInt();
				for (int i = 0; i < datasetRows; i++) {
					BigDecimal x1 = sc.nextBigDecimal();
					BigDecimal y1 = sc.nextBigDecimal();
					BigDecimal x2 = sc.nextBigDecimal();
					BigDecimal y2 = sc.nextBigDecimal();
					BigDecimal x3 = sc.nextBigDecimal();
					BigDecimal y3 = sc.nextBigDecimal();
					BigDecimal x4 = sc.nextBigDecimal();
					BigDecimal y4 = sc.nextBigDecimal();

					if ((y4.subtract(y3)).divide(x4.subtract(x3),
							RoundingMode.DOWN).equals(
							(y2.subtract(y1)).divide(x2.subtract(x1),
									RoundingMode.DOWN)))
						System.out.println("YES");

					else
						System.out.println("NO");
				}
			}
		} finally {
			sc.close();
		}
	}
}