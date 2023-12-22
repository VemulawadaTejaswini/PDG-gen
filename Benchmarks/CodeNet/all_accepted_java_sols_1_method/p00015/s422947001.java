import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader sr = null;
		Scanner sc = null;
		BigDecimal value1 = null;
		BigDecimal value2 = null;
		BigDecimal sum = new BigDecimal("0");

		try {
			sc = new Scanner(sr = new InputStreamReader(System.in));
			int datasets = sc.nextInt();

			for (int i = 1; i <= datasets; i++) {

				value1 = sc.nextBigDecimal();
				value2 = sc.nextBigDecimal();
				sum = sum.add(value1.add(value2));

				if (sum.precision() > 80) {
					System.out.println("overflow");
				} else {
					System.out.println(sum.toPlainString());
				}
				sum = BigDecimal.ZERO;
			}

		} catch (NoSuchElementException e) {

		}

		finally {
			sr.close();
			sc.close();
		}

	}

}