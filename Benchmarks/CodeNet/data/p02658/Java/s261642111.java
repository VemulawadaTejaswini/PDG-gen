import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigDecimal[] an = new BigDecimal[n];

		for (int i = 0; i < n; i++) {
			BigDecimal a = scan.nextBigDecimal();
			an[i] = a;
		}

		BigDecimal ans = BigDecimal.ONE;
		for (int i = 0; i < an.length; i++) {
			ans = ans.multiply(an[i]);
		}

		if (ans.compareTo(BigDecimal.ONE.scaleByPowerOfTen(18)) <= 0) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}

		scan.close();
	}

}
