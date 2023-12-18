import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// X * 1.08 = N
		// X = N / 1.08
		// X = 432 * 1.08
		BigDecimal X = new BigDecimal(N / 1.08);
		BigDecimal X1Ceil = X.setScale(0, BigDecimal.ROUND_CEILING);
		BigDecimal X1Floor = X.setScale(0, BigDecimal.ROUND_FLOOR);
		BigDecimal N1Ceil = X1Ceil.multiply(new BigDecimal(1.08));
		BigDecimal N1Floor = X1Floor.multiply(new BigDecimal(1.08));
		String ans;
		if (N == N1Ceil.intValue()) {
			ans = String.valueOf(X1Ceil);
		} else if (N == N1Floor.intValue()) {
			ans = String.valueOf(X1Floor);
		} else {
			ans = ":(";
		}
		System.out.println(ans);
	}

}
