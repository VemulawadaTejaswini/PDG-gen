import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (a[i + 1] + a[i] < b[i]) {
				ans += a[i + 1] + a[i];
				a[i] = 0;
			} else {
				ans += b[i];
				if (a[i + 1] < b[i]) {
					a[i] -= b[i] - a[i + 1];
				}
			}
		}
		System.out.println(ans);
	}
}
