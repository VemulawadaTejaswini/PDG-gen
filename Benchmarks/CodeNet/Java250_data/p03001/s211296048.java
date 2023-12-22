import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();
		BigDecimal TWO = new BigDecimal(2);
		BigDecimal bg_W = new BigDecimal(W);
		BigDecimal bg_H = new BigDecimal(H);
		int ans2 = 0;
		if (new BigDecimal(x).multiply(TWO).equals(bg_W) && new BigDecimal(y).multiply(TWO).equals(bg_H)) {
			ans2 = 1;
		}

		System.out.print(bg_W.multiply(bg_H).divide(TWO, 8, BigDecimal.ROUND_DOWN));
		System.out.println(" " + ans2);
	}
}
