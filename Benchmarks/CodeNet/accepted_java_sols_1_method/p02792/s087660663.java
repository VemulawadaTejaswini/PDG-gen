import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		int[][] cnt = new int[10][10];
		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			int a = s.charAt(0) - '0';
			int b = s.charAt(s.length() - 1) - '0';
			cnt[a][b]++;
		}

		long ans = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				long val = (long) cnt[i][j] * cnt[j][i];
				ans += val;
			}
		}
		System.out.println(ans);
	}
}
