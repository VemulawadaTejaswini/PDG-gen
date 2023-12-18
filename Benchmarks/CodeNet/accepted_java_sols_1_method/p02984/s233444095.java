import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] aa = new long[n];
		long a = 0;
		long g = 0;
		long k = 0;
		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextLong();
			if (i % 2 == 0) {
				g += aa[i];
			} else {
				k += aa[i];
			}
		}

		System.out.print(g - k);
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				k -= aa[i - 1];
				g += aa[i - 1];
				System.out.print(" " + (g - k));
			} else {
				k += aa[i - 1];
				g -= aa[i - 1];
				System.out.print(" " + (k - g));
			}
		}
	}
}
