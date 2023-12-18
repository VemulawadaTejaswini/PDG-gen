import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BigDecimal a = scan.nextBigDecimal();
		BigDecimal b = scan.nextBigDecimal();

		BigDecimal ans = a.multiply(b).setScale(0, RoundingMode.DOWN);
		System.out.println(ans);

		scan.close();

	}

}
