import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		int n = 0;
		String s = null;
		int result = 0;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextBigDecimal()) {

				BigDecimal a = sc.nextBigDecimal();
				BigDecimal b = sc.nextBigDecimal();
				n = sc.nextInt();

				s = String.valueOf(a.divide(b, n, RoundingMode.DOWN));
				String[] str = s.substring(s.indexOf(".") + 1,s.indexOf(".") + ( 1+ n)).split("(?<=.)");

				for (String sum : str) {

					result += Integer.parseInt(sum);

				}

				System.out.println(result);
				result = 0;

			}

		} finally {
			sc.close();
		}

	}

}