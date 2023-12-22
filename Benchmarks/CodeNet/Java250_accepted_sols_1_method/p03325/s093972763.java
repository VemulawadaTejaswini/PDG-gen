import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		int ans = 0, o = 0, e = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x % 2 == 0) {
				a[e] = x;
				e++;
			} else {
				o++;
			}
		}
		if (o != n) {
			for (int i = 0; i < e; i++) {
				while (a[i] % 2 == 0) {
					ans++;
					a[i] = a[i] / 2;
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
