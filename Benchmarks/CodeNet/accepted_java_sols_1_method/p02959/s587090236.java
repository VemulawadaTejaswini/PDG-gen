import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];
		for (int i = 0; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			long val = Math.min(a[i + 1], b[i]);
			ans += val;
			b[i] -= val;
			val = Math.min(a[i], b[i]);
			ans += val;
			a[i] -= val;
		}
		System.out.println(ans);
	}
}
