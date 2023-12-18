import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		int sum = 0;

		if (d == 0) {
			sum = n;
		} else {
			sum = (n - d) * 2;
		}
		System.out.println(BigDecimal.valueOf((double) (m - 1) * sum / n / n).toPlainString());

		sc.close();
	}

}
