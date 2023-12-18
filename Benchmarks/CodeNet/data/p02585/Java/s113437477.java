import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();

		long ans = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int idx = i;
			long max = Long.MIN_VALUE;
			long one = 0;
			for (int j = 1; j <= k; j++) {
				idx = p[idx];
				one += c[idx];
				max = Math.max(max, one);
				if (idx == i) {
					if (one < 0) {
						ans = Math.max(ans, max);
					} else {
						long x = k / j;
						long val = one * x;
						long r = k % j;
						one = 0;
						max = 0;
						for (int j2 = 0; j2 < r; j2++) {
							idx = p[idx];
							one += c[idx];
							max = Math.max(max, one);
						}
						val += max;
						ans = Math.max(ans, val);
					}
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
