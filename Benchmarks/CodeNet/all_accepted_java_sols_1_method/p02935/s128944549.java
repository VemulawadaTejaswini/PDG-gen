import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			Arrays.sort(array);
			BigDecimal ans = BigDecimal.ZERO;
			for (int i = 1; i <= size; i++) {
				BigDecimal div;
				if (i == size) {
					div = new BigDecimal(Math.pow(2, i - 1));
				} else {
					div = new BigDecimal(Math.pow(2, i));
				}
				ans = ans.add(new BigDecimal(array[size - i]).divide(div).setScale(10, BigDecimal.ROUND_HALF_UP));
			}
			System.out.println(ans);
		}
	}
}
