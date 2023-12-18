import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] road = new int[h][w];
		int[][] dp = new int[h][w];
		for(int i=0;i<h;i++) {
			String str = sc.next();
			for(int j=0;j<w;j++) {
				char c = str.charAt(j);
				road[i][j] = c - '0';
			}
		}
		
		dp[0][0] = 0;
		for(int j=1;j<w;j++) {
			dp[0][j] = dp[0][j-1] + road[0][j];
		}
		for(int i=1;i<h;i++) {
			dp[i][0] = dp[i-1][0] + road[i][0];
		}
		for(int i=1;i<h;i++) {
			for(int j=1;j<w;j++) {
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + road[i][j];
			}
		}
		System.out.println(dp[h-1][w-1]);
	}
}






