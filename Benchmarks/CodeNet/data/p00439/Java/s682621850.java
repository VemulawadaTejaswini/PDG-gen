import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int a[];
		int sum, max;

		n = sc.nextInt();
		k = sc.nextInt();
		while (n + k != 0) {
			sum = 0;
			max = 0;
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n - k + 1; i++) {
				for (int j = 0; j < k; j++) {
					sum += a[i + j];
					if (max < sum) {
						max = sum;
					}
				}
				sum = 0;
			}
			System.out.println(max);
			n = sc.nextInt();
			k = sc.nextInt();
		}
	}
}