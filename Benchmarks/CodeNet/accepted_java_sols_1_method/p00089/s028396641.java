import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		while(sc.hasNext()) {
			String s = sc.next();
			//if(s.equals("0")) break;
			list.add(s);
		}
		sc.close();
		int h = list.size();
		int m = list.size() / 2;
		int[][] dp = new int[h + 1][m + 1];
		//dp[0][0] = Integer.parseInt(list.get(0));
		for(int i = 0; i < h; i++) {
			String[] t1 = list.get(i).split(",");
			int l = t1.length;
			int[] t = new int[l];
			for(int j = 0; j < l; j++) {
				t[j] = Integer.parseInt(t1[j]);
			}
			if(i < m) {
				for(int j = 0; j < l; j++) {
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + t[j]);
					dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + t[j]);
				}
			}else {
				for(int j = 0; j < l; j++) {
					if(j == 0) {
						dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + t[j]);
					}else if(j == l - 1) {
						dp[i + 1][j - 1] = Math.max(dp[i + 1][j - 1], dp[i][j] + t[j]);
					}else {
						dp[i + 1][j - 1] = Math.max(dp[i + 1][j - 1], dp[i][j] + t[j]);
						dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + t[j]);
					}

				}
			}

		}
//		for(int i = 0; i < h; i++) {
//			for(int j = 0; j <= m; j++) {
//				System.out.printf("%d ", dp[i][j]);
//			}
//			System.out.println();
//		}
		System.out.println(dp[h][0]);
	}
}
