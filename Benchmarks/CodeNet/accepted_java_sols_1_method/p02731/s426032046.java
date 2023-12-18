import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		BigDecimal wSide = new BigDecimal((double)len/3);
		BigDecimal tSide = new BigDecimal((double)len/3);
		BigDecimal hSide = new BigDecimal((double)len/3);

		BigDecimal result = wSide.multiply(tSide).multiply(hSide);

		System.out.print(result);
		sc.close();
	}
}
