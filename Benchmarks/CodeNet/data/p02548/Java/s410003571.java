import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;


		BigDecimal delta = new BigDecimal("0.0000001");
		BigDecimal bn = new BigDecimal(n);

		for (int i = 1; i < n; i++) {

			BigDecimal sub = bn.divide(new BigDecimal(i).add(delta),MathContext.DECIMAL128);
			count += sub.intValue();
		}
		System.out.println(count);

	}
}
