import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long ans1 = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (i % 2 == 1) {
				if (sum <= 0) {
					ans1 += 1 - sum;
					sum = 1;
				}
			} else {
				if (sum >= 0) {
					ans1 += 1 + sum;
					sum = -1;
				}
			}
		}

		long ans2 = 0;
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (i % 2 == 1) {
				if (sum >= 0) {
					ans2 += 1 + sum;
					sum = -1;
				}
			} else {
				if (sum <= 0) {
					ans2 += 1 - sum;
					sum = 1;
				}
			}
		}

		System.out.println(Math.min(ans1, ans2));
	}
}
