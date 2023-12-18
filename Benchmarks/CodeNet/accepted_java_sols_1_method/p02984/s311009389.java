import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sum += a[i];
			} else {
				sum -= a[i];
			}
		}

		long[] ans = new long[n];
		ans[0] = sum;
		for (int i = 1; i < n; i++) {
			ans[i] = 2 * a[i - 1] - ans[i - 1];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
