
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
				if (a[i] == 0) {
					System.out.println(0);
					return;
				}
			}

			long result = 1;
			for (long i : a) {
				result *= i;
				if (result > 1000000000000000000L) {
					System.out.println(-1);
					return;
				}
			}
			System.out.println(result);
		}
	}
}
