import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	/**
	 * ?????°???index
	 */
	final static int A = 0;
	final static int B = 1;
	final static int C = 2;
	final static int D = 3;
	final static int E = 4;
	final static int F = 5;

	/**
	 * AOJ 0004 Simultaneous Equation
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String input = bufferedReader.readLine();
		String[] coefficients;
		while (input != null) {
			coefficients = input.split("\\s");

			BigDecimal[] bdCoefficients = getBigDecimalArray(coefficients);

			BigDecimal ae_bd = bdCoefficients[A].multiply(bdCoefficients[E])
					.subtract(bdCoefficients[B].multiply(bdCoefficients[D]));
			BigDecimal x = bdCoefficients[C].multiply(bdCoefficients[E])
					.subtract(bdCoefficients[B].multiply(bdCoefficients[F]))
					.divide(ae_bd, 3, RoundingMode.HALF_UP);
			BigDecimal y = bdCoefficients[A].multiply(bdCoefficients[F])
					.subtract(bdCoefficients[C].multiply(bdCoefficients[D]))
					.divide(ae_bd, 3, RoundingMode.HALF_UP);
			System.out.println(x + " " + y);

			input = bufferedReader.readLine();
		}
	}

	/**
	 * String????????????BigDecimal?????????????????????????????´??????
	 *
	 * @param strArray
	 *            String?????????
	 * @return BigDecimal?????????
	 */
	private static BigDecimal[] getBigDecimalArray(String[] strArray) {
		BigDecimal[] bigDecimalArray = new BigDecimal[strArray.length];
		for (int i = 0; i < bigDecimalArray.length; i++) {
			bigDecimalArray[i] = new BigDecimal(strArray[i]);
		}
		return bigDecimalArray;
	}

}