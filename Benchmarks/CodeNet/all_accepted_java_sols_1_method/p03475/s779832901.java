import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] c = new int[n - 1];
		int[] s = new int[n - 1];
		int[] f = new int[n - 1];
		int[] ans = new int[n];

		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++) {
			ans[i] = s[i];
			for (int j = i + 1; j < n; j++) {
				ans[i] += c[j - 1];
				if (j == (n - 1)) {
					break;
				}
				int x = s[j];
				while (ans[i] > x) {
					x += f[j];
				}
				if (ans[i] != x) {
					ans[i] += (x - ans[i]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}

		sc.close();
	}
}
