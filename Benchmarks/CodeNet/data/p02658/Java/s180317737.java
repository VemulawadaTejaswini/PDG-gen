import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		BigDecimal result = BigDecimal.ONE;
		for (int i = 0; i < a.length; i++) {
			result = result.multiply(BigDecimal.valueOf(a[i]));
			if(result.equals(BigDecimal.ZERO)) break; 
		}
		if(result.compareTo(BigDecimal.valueOf(1000000000000000000L)) > 0) {
			System.out.println(-1);
		} else {
			System.out.println(result.longValue());
		}
	}
}
