import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		int d = n - k;
		for (int i = 0; i <= d; i++) {
			int left = Math.abs(x[i]) + x[i + k - 1] - x[i];
			int right = Math.abs(x[i + k - 1]) + x[i + k - 1] - x[i];
			ans = Math.min(ans, Math.min(left, right));
		}
		System.out.println(ans);
	}
}
