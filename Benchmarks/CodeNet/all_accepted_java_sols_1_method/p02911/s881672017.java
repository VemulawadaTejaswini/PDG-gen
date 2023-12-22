import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
		int q = sc.nextInt();

		long ten[] = new long[n + 1];
		Arrays.fill(ten, k - q);

		for (int i = 0; i < q; i++) {
			ten[sc.nextInt()]++;
		}
		for (int i = 1; i <= n; i++) {
			if (ten[i] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}