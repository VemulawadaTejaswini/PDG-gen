
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			long result = 0;
			for (int i = n - 1; i >= n / 2; i--) {
				result += a[i] * 2;
			}
			if (n % 2 == 1) {
				result -= a[n / 2];
			}
			result -= a[n - 1];
			System.out.println(result);
		}
	}
}
