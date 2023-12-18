import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] mv = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	static char[] c = { 'U', 'R', 'D', 'L' };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] e = new boolean[25][25];
		int h = 0, t = 0;
		for (int x = 0; x < 9; x++) {
			char[] s = br.readLine().toCharArray();
			for (int j = 0; j < s.length; j++) {
				if (s[j] == '0') continue;
				if (t == 0) {
					e[h * 5 + j][h * 5 + j + 1] = e[h * 5 + j + 1][h * 5 + j] = true;
				} else {
					e[h * 5 + j][(h + 1) * 5 + j] = e[(h + 1) * 5 + j][h * 5 + j] = true;
				}
			}
			if (t == 1) h++;
			t = (t + 1) % 2;
		}
		int i = 0, j = 0, d = 1;
		StringBuilder sb = new StringBuilder();
		boolean f = true;
		while (f) {
			for (int k = 3; k <= 6; k++) {
				int nd = (d + k) % 4;
				int ni = i + mv[nd][0];
				int nj = j + mv[nd][1];
				if (0 <= ni && ni < 5 && 0 <= nj && nj < 5 && e[i * 5 + j][ni * 5 + nj]) {
					sb.append(c[nd]); i = ni; j = nj; d = nd;
					if (i == 0 && j == 0) f = false;
					break;
				}
			}
		}
		System.out.println(sb);
	}
}