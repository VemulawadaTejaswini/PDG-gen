import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		int[][] s = new int[h][w];
		for (int i = 0; i < h; i++) {
			char[] ca = br.readLine().toCharArray();
			for (int j = 0; j < w; j++) {
				s[i][j] = ca[j] - '0';
			}
		}
		br.close();

		int ans = Integer.MAX_VALUE;
		int h1 = h - 1;
		int end = 1 << h1;
		label:
		for (int i = 0; i < end; i++) {
			int[][] a = new int[h][w];
			int j2 = 0;
			for (int j = 0; j < h; j++) {
				for (int j3 = 0; j3 < w; j3++) {
					a[j2][j3] += s[j][j3];
				}
				if ((i >> j & 1) == 1) {
					j2++;
				}
			}

			int cnt = Integer.bitCount(i);
			int[] sum = new int[h];
			int miss = -1;
			for (int j3 = 0; j3 < w; j3++) {
				boolean flg = false;
				for (int j = 0; j < h; j++) {
					sum[j] += a[j][j3];
					if (sum[j] > k) {
						cnt++;
						flg = true;
						break;
					}
				}
				if (flg) {
					if (j3 == miss) {
						continue label;
					}
					miss = j3;
					Arrays.fill(sum, 0);
					j3--;
				}
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
