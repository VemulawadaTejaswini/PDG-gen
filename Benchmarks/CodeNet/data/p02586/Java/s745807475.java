import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		int[][] v = new int[h + 1][w + 1];
		for (int i = 0; i < k; i++) {
			sa = br.readLine().split(" ");
			int r = Integer.parseInt(sa[0]);
			int c = Integer.parseInt(sa[1]);
			v[r][c] = Integer.parseInt(sa[2]);
		}
		br.close();

		long[][][] dp = new long[h + 1][w + 1][4];
		for (int x = 1; x <= h; x++) {
			for (int y = 1; y <= w; y++) {
				for (int z = 1; z <= 3; z++) {
					dp[x][y][z] = Math.max(dp[x][y - 1][z], dp[x][y - 1][z - 1] + v[x][y]);
				}
				long ue = max(dp[x - 1][y]);
				dp[x][y][0] = Math.max(dp[x][y - 1][0], ue);
				dp[x][y][1] = Math.max(dp[x][y][1], ue + v[x][y]);
			}
		}
		System.out.println(max(dp[h][w]));
	}

	static long max(long[] a) {
		long ret = 0;
		for (int i = 0; i < a.length; i++) {
			ret = Math.max(ret, a[i]);
		}
		return ret;
	}
}
