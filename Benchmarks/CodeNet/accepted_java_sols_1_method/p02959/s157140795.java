import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n + 1];
		int b[] = new int[n];
		for (int i = 0; i < n + 1; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (b[i] >= a[i]) {
				ans += a[i];
				b[i] -= a[i];
			} else {
				ans += b[i];
				b[i] = 0;
			}
			if (b[i] >= a[i + 1]) {
				ans += a[i + 1];
				b[i] -= a[i + 1];
				a[i + 1] = 0;
			} else {
				ans += b[i];
				a[i + 1] -= b[i];
				b[i] = 0;
			}
		}
		System.out.println(ans);
		in.close();
	}
}
