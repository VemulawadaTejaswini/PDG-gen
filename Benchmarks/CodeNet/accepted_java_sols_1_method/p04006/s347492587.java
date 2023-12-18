import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer x = sc.nextInt();
		Integer[] a = new Integer[n + 1];
		Integer[][] b = new Integer[n + 1][n];
		Long result;
		Long cost = 0L;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			b[i][0] = a[i];
			cost += b[i][0];
		}
		result = cost;
		for (int k = 1; k < n; k++) {
			cost = (long) k * x;
			for (int i = 1; i <= n; i++) {
				if (i > k) {
					b[i][k] = Math.min(b[i][k - 1], a[i - k]);
				} else {
					b[i][k] = Math.min(b[i][k - 1], a[i - k + n]);
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
