import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		String matrix[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
			}
		}

		int dx[] = { 1, 0 };
		int dy[] = { 0, 1 };

		int dp[][] = new int[110][110];
		for (int i = 0; i < h; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}

		if (matrix[0][0].equals("#"))
			dp[0][0] = 1;
		else
			dp[0][0] = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 2; k++) {
					int nx = j + dx[k];
					int ny = i + dy[k];

					if (ny >= h || nx >= w)
						continue;

					if (matrix[ny][nx].equals(".")) {
						dp[ny][nx] = Math.min(dp[ny][nx], dp[i][j]);
					} else {
						if (matrix[i][j].equals(".")) {
							dp[ny][nx] = Math.min(dp[ny][nx], dp[i][j] + 1);
						} else {
							dp[ny][nx] = Math.min(dp[ny][nx], dp[i][j]);
						}
					}
				}
			}
		}

		System.out.println(dp[h - 1][w - 1]);
	}
}
