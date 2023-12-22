import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.parallelSort(a);
		BigDecimal result = BigDecimal.ONE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				result = BigDecimal.ZERO;
				break;
			} else if(result.compareTo(BigDecimal.valueOf(-1)) == 0) {
				break;
			}
			result = result.multiply(BigDecimal.valueOf(a[i]));
			if(result.compareTo(BigDecimal.valueOf(1000000000000000000L)) > 0) {
				result = BigDecimal.valueOf(-1);
			}
		}
		System.out.println(result);
	}
}
