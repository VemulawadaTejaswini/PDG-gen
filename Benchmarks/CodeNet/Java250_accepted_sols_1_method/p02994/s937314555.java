import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();

		int sum = 0; // sum of taste

		// flag
		boolean positive = l >= 0;
		boolean t0 = false;

		for (int i = 1; i <= n; i++) {
			int t = l + i - 1; // taste
			if (positive) {
				if (i == 1) {
					continue;
				}
			} else {
				if (t == 0) {
					t0 = true;
					continue;
				}
				if (!t0 && i == n) {
					continue;
				}
			}
			sum += t;
		}

		System.out.println(sum);

		sc.close();
	}
}
