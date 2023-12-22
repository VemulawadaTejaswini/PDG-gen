import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		int end = 1 << h - 1;
		label:
		for (int i = 0; i < end; i++) {
			int[] g = new int[h];
			int idx = 0;
			for (int j = 0; j < h - 1; j++) {
				if ((i >> j & 1) == 1) {
					idx++;
				}
				g[j + 1] = idx;
			}

			int val = idx;
			int[] cnt = new int[idx + 1];
			for (int x = 0; x < w; x++) {
				for (int j = 0; j < h; j++) {
					if (s[j][x] == '1') {
						cnt[g[j]]++;
					}
				}
				boolean flg = true;
				for (int j = 0; j < cnt.length; j++) {
					if (cnt[j] > k) {
						flg = false;
						val++;
						break;
					}
				}
				if (!flg) {
					Arrays.fill(cnt, 0);
					for (int j = 0; j < h; j++) {
						if (s[j][x] == '1') {
							cnt[g[j]]++;
						}
					}
					for (int j = 0; j < cnt.length; j++) {
						if (cnt[j] > k) {
							continue label;
						}
					}
				}
			}
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
