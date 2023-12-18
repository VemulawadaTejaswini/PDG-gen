import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcasenum = sc.nextInt();
		for(int testcase = 0;testcase<testcasenum;testcase++) {
			int gx = sc.nextInt();
			int gy = sc.nextInt();
			boolean[][] wall = new boolean[gx*2+1][gy*2+1];
			for(int x=0;x<gx;x++) {
				for(int y=0;y<gy;y++) {
					wall[x*2+1][y*2+1] = true;
				}			
			}
			int p = sc.nextInt();
			for(int i=0;i<p;i++) {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				wall[x1+x2][y1+y2] = true;
			}
			//printArray(wall);
			long[][] dp = new long[gx*2+1][gy*2+1];
			dp[0][0] = 1;
			for(int x=0;x<dp.length;x++) {
				for(int y=0;y<dp[0].length;y++) {
					if(x!=0) {
						if (!wall[x-1][y]) {
							dp[x][y] += dp[x-1][y];
						}
					}
					if (y!=0) {
						if (!wall[x][y-1]) {
							dp[x][y] += dp[x][y-1];
						}
					}
				}
			}
			long ans = dp[gx*2][gy*2];
			System.out.println(ans == 0 ? "Miserable Hokusai!" : ans);
		}
	}

	public static void printArray(boolean[][] o) {
		for(int i=0;i<o.length;i++) {
			for(int j=0;j<o[0].length;j++) {
				System.out.print(o[i][j] + "\t");
			}
			System.out.println();
		}
	}
}