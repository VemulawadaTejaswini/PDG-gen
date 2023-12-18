import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> Vlist = new ArrayList<Integer>();
		List<Integer> Wlist = new ArrayList<Integer>();
		int dp[][] = new int[101][10001];
		
		for (int i = 0; i < 101; i++) {
			Arrays.fill(dp[i], 0);
		}
		
		int N = in.nextInt();
		int W = in.nextInt();
		for (int i = 0; i < N; i++) {
			int vval = in.nextInt();
			int wval = in.nextInt();
			Vlist.add(vval);
			Wlist.add(wval);
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if (Wlist.get(i-1) > j) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = Math.max(dp[i-1][j-Wlist.get(i-1)]+Vlist.get(i-1), dp[i-1][j]);
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}

