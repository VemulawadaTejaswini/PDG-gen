import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int S;
	private static int N;
	private static int cnt = 0;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] arrays;

		while ((line = br.readLine()) != null) {
			arrays = line.split(" ");
			N = Integer.parseInt(arrays[0]);
			S = Integer.parseInt(arrays[1]);

			if (N <= 10 && S < 286) {
				comb(0, 1, new boolean[10]);
			}
			System.out.println(cnt);
			cnt = 0;

		}
	}

	private static void comb(int sum, int n, boolean[] c) {
		
		// ｎ件目は残りをnで割り切れるかどうかのチェックをする
		if (n == N) {
			if ((S - sum) % n == 0) {
				int a = (S - sum) / n;
				if (a < 10
						&& !c[a]) {
					cnt++;
				}
			}
			return;
		}

		// 1〜n-1件目は全探索
		for (int i = 0; i <= 9; i++) {
			if (c[i]) {
				continue;
			} else if (sum + i * n <= S && n < N) {
				c[i] = true;
				comb(sum + i * n, n + 1, c);
				c[i] = false;
			} else if (sum + i * n > S) {
				break;
			}
		}
	}
}