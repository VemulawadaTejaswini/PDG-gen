import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N/2+N%2;
		BigDecimal a = new BigDecimal(N);
		BigDecimal b = new BigDecimal(temp);
		b =b.divide(a, 12,RoundingMode.HALF_UP);
		System.out.println(b.toPlainString());
	}
}
