import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[], b[];
		int sum, max;

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			sum = 0;
			max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			b = new int[sum / 2];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] - 1 == j) {
						b[j] = a[i];
					} else if (a[i] - 1 < j) {
						b[j] = b[j - a[i]] + a[i];
					}
					if (max < b[j]) {
						max = b[j];
					}
				}
			}
			System.out.println(sum - 2 * max);
			n = sc.nextInt();
		}
	}
}