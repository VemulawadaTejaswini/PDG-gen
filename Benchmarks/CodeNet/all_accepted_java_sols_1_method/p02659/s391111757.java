import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();

		BigDecimal Ab = BigDecimal.valueOf(A);
		BigDecimal Bb = BigDecimal.valueOf(B);

		BigDecimal res = Ab.multiply(Bb);
		res = res.setScale(0, BigDecimal.ROUND_DOWN);
		System.out.println(res);
	}
}