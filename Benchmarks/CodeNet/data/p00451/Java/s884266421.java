
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			String t = sc.nextLine();
			int ss = s.length();
			int tt = t.length();
			int[][] dp = new int[ss][tt];
			for(int j = 0; j < tt; j++) {
				dp[0][j] = s.charAt(0) == t.charAt(j) ? 1 : 0;
			}
			for(int i = 0; i < ss; i++) {
				dp[i][0] = s.charAt(i) == t.charAt(0) ? 1 : 0;
			}
			int m = 0;
			for(int i = 1; i < ss; i++) {
				for(int j = 1; j < tt; j++) {
					dp[i][j] = s.charAt(i) == t.charAt(j) ? dp[i - 1][j - 1] + 1 : 0;
					m = Math.max(m, dp[i][j]);
				}
			}
			System.out.println(m);
		}
	}
}


