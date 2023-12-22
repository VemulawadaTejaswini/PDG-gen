import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();

		long ans = a.multiply(b).setScale(0, RoundingMode.FLOOR).longValue();
		System.out.println(ans);


	}

}