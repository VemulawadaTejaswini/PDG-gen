import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] p = new int[n];
			long[] c = new long[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			long ans = Long.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				int next = i;
				long max = Long.MIN_VALUE;
				long score = 0;
				for (int j = 0; j < k; j++) {
					next = p[next] - 1;
					score += c[next];
					max = Math.max(max, score);
					if (next == i) {
						if (score > 0) {
							long tmpmax = Long.MIN_VALUE;
							long tmpscore = 0;
							int roopcnt = k / (j + 1) - 1;
							int amari = k % (j + 1) + (j + 1);
							next = i;
							for (int l = 0; l < amari; l++) {
								next = p[next] - 1;
								tmpscore += c[next];
								tmpmax = Math.max(tmpmax, tmpscore);
							}
							max = Math.max(tmpmax + roopcnt * score, max);
						}
						break;
					}
				}
				ans = Math.max(max, ans);
			}
			System.out.println(ans);
		}
	}
}