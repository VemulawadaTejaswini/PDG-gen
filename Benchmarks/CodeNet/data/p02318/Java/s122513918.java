import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	private Scanner scan;
	private char[] s1,s2;

	private int dp[][];

	private void mainrun() {

		scan = new Scanner(System.in);

		s1 = scan.nextLine().toCharArray();
		s2 = scan.nextLine().toCharArray();

		dp = new int[s1.length + 1][s2.length + 1];

		dp[0][0] = 0;

		for(int i = 1;i < s1.length + 1;i++) {
			dp[i][0] = i;
		}

		for(int i = 1;i < s2.length + 1;i++) {
			dp[0][i] = i;
		}

		for(int i = 1;i < s1.length + 1; i++) {
			for(int j = 1; j < s2.length + 1;j++) {
				dp[i][j] = Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1)
									, dp[i-1][j-1] +( s1[i-1] == s2[j-1] ? 0:1));
			}
		}

		System.out.println(dp[s1.length][s2.length]);

		scan.close();
	}
}

