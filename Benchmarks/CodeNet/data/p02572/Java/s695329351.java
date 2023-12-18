
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			long result = 0;
			for (int i = 0; i < n - 1; i++) {
				long tmp = 0;
				for (int j = i + 1; j < n; j++) {
					tmp += a[j];
				}
				tmp *= a[i];
				tmp %= 1000000007;
				result += tmp;
			}
			result %= 1000000007;
			System.out.println(result);
		}
	}
}
