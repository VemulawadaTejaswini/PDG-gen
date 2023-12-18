import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = -101;
		int min = 101;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		int ans = Integer.MAX_VALUE;
		int t;
		for (int i = min; i <= max; i++) {
			t = 0;
			for (int j = 0; j < n; j++) {
				t += (a[j] - i) * (a[j] - i);
			}
			ans = Math.min(ans, t);
		}
		System.out.println(ans);

	}
}
