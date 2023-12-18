import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int[][] ans = new int[h][w];
		int idx1 = 0;
		label:
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					idx1 = i;
					break label;
				}
			}
		}

		int[] cnt = new int[h];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					cnt[i]++;
				}
			}
		}

		int num = 1;
		int prev = -1;
		int next = -1;
		for (int i = 0; i < h; i++) {
			if (cnt[i] == 0) {
				if (prev == -1) {
					prev = i;
				}
				continue;
			}
			for (int j = i + 1; j < h; j++) {
				if (cnt[j] == 0) {
					next = j;
				} else {
					break;
				}
			}
			if (prev == -1) {
				prev = i;
			}
			if (next == -1) {
				next = i;
			}
			for (int j = 0; j < w; j++) {
				for (int x = prev; x <= next; x++) {
					ans[x][j] = num;
				}
				if (s[i][j] == '#' && cnt[i] > 1) {
					num++;
					cnt[i]--;
				}
			}
			i = next;
			prev = -1;
			next = -1;
			num++;
		}
		for (int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < w; j++) {
				sb.append(ans[i][j]).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
