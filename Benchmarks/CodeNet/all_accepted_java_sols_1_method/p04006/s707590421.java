import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer x = sc.nextInt();
		Integer[] a = new Integer[n + 1];
		Integer[][] b = new Integer[n + 1][n];
		Long result = Long.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for (int k = 0; k < n; k++) {
			Long cost = (long) k * x;
			for (int i = 1; i <= n; i++) {
				if (k == 0) {
					b[i][k] = a[i];
				} else {
					if (i > k) {
						b[i][k] = Math.min(b[i][k - 1], a[i - k]);
					} else {
						b[i][k] = Math.min(b[i][k - 1], a[i - k + n]);
					}
				}
				cost += b[i][k];
			}
			if (cost < result) {
				result = cost;
			}
		}
		System.out.println(result);
	}
}
