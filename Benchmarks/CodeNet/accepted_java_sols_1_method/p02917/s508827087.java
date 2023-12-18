import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		int[] a = new int[n];
		a[0] = b[0];
		for (int i = 1; i < n - 1; i++) {
			a[i] = Math.min(b[i - 1], b[i]);
		}
		a[n - 1] = b[n - 2];

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}
