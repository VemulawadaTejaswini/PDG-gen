import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<TreeMap<Integer, Integer>> list = new ArrayList<>();
		for (int i = 0; i < r; i++) {
		    list.add(new TreeMap<>());
		}
		for (int i = 0; i < k; i++) {
		    int x = sc.nextInt() - 1;
		    int y = sc.nextInt() - 1;
		    int v = sc.nextInt();
		    list.get(x).put(y, v);
		}
		long[][][] dp = new long[4][r][c];
		for (int i = 0; i < r; i++) {
		    for (int j = 0; j < c; j++) {
		        if (i > 0) {
		            dp[0][i][j] = dp[3][i - 1][j];
		        }
		        if (j > 0) {
		            for (int l = 0; l < 4; l++) {
		                dp[l][i][j] = Math.max(dp[l][i][j], dp[l][i][j - 1]);
		            }
		        }
		        for (int l = 1; l < 4; l++) {
		            dp[l][i][j] = Math.max(dp[l][i][j], dp[l - 1][i][j]);
		        }
		        if (list.get(i).containsKey(j)) {
		            dp[3][i][j] = Math.max(dp[3][i][j], dp[2][i][j] + list.get(i).get(j));
		            dp[2][i][j] = Math.max(dp[2][i][j], dp[1][i][j] + list.get(i).get(j));
		            dp[1][i][j] = Math.max(dp[1][i][j], dp[0][i][j] + list.get(i).get(j));
		        }
		    }
		}
		System.out.println(dp[3][r - 1][c - 1]);
	}
}
