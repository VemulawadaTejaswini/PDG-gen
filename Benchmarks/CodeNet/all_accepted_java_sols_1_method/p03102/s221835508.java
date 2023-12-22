import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		int[] a = new int[m];
		int cnt = 0;
		int ans = c;
		for (int i = 0; i < n; i++) {
			ans = c;
			for (int j = 0; j < m; j++) {
				a[j] = sc.nextInt();
				ans += a[j] * b[j];
			}
			if (ans > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
