import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] u = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n - 1; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += (long) i * (i + 1) / 2;
		}

		for (int i = 0; i < n - 1; i++) {
			ans -= (long) Math.min(u[i], v[i]) * (n - Math.max(u[i], v[i]) + 1);
		}
		System.out.println(ans);
	}
}
