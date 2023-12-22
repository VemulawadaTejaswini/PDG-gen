

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int l = scan.nextInt();
		BigDecimal bigL = new BigDecimal(l * l * l);
		BigDecimal big27 = new BigDecimal(27.000000);

		BigDecimal result = bigL.divide(big27, 6, BigDecimal.ROUND_HALF_UP);

		System.out.println(result);
	}

}
