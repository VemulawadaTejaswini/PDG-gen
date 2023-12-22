import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();

		sc.close();

		BigDecimal ans = a.multiply(b);

		System.out.println(ans.setScale(0, BigDecimal.ROUND_DOWN));

	}

}