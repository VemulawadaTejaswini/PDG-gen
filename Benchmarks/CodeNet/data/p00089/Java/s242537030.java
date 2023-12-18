import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] dp = new int[101][101];
		int linenum = 0;
		while(sc.hasNext()) {
			String s = sc.next();
			String[] nums = s.split(",");
			for(int i=0;i<nums.length;i++) {
				dp[51-nums.length+i*2][linenum+1] = Integer.valueOf(nums[i]);
			}
			linenum++;
		}
		for(int y=1;y<=100;y++) {
			for(int x=1;x<100;x++) {
				dp[x][y] += Math.max(dp[x-1][y-1],dp[x+1][y-1]);
			}
		}
		int ans = 0;
		for(int i=0;i<=100;i++) {
			ans = Math.max(ans,dp[i][100]);
		}
		System.out.println(ans);
	}
}