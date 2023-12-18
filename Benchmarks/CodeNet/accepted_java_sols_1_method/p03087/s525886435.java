import java.util.Scanner;

public class Main {
	static boolean memo[];
	static int ans, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] cnt = new int[n];
		cnt[0] = 0;
		for (int i = 1; i < n; i++) {
			if (s[i - 1] == 'A' && s[i] == 'C') {
				cnt[i] = cnt[i - 1] + 1;
			} else {
				cnt[i] = cnt[i - 1];
			}
		}
		int l, r;
		for (int i = 0; i < q; i++) {
			l = sc.nextInt() - 1;
			r = sc.nextInt() - 1;
			sb.append(cnt[r] - cnt[l] + "\n");
		}
		System.out.print(sb);
	}
}
