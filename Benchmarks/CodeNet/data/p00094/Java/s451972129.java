import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		double a = new java.util.Scanner(System.in).nextDouble();
		double b = new java.util.Scanner(System.in).nextDouble();

		double ans = a * b / 3.305785;

		BigDecimal x = new BigDecimal(ans);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);

		System.out.println(x);

	}

}