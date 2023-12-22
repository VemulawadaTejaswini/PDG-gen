import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(a);
		var result = BigDecimal.valueOf(1);
		for (int i = 0; i < n; i++) {
			result = result.multiply(BigDecimal.valueOf(a[i]));
			if (result.compareTo(BigDecimal.valueOf(Math.pow(10, 18))) > 0) {
				result = BigDecimal.valueOf(-1);
				break;
			}
		}

		System.out.println(result);
	}
}