
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int[][]G = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				G[i][j] = scan.nextInt();
			}
		}
		scan.close();
		if(H == 1) {
			for(int i = 0; i < W; i++) {
				if(G[0][i] == 0) {
					System.out.println(1);
					System.exit(0);
				}
			}
			System.out.println(0);
		}else if(W == 1) {
			for(int i = 0; i < H; i++) {
				if(G[i][0] == 0) {
					System.out.println(1);
					System.exit(0);
				}
			}
			System.out.println(0);
		}else {
			System.out.println(getLargestSquare(H, W, G));
		}

	}
	static int getLargestSquare(int H, int W, int[][]G) {
		int maxWidth = 0;
		int[][]dp = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				// 1と0を入れ替える
				dp[i][j] = (G[i][j] + 1) % 2;
			}
		}
		for(int i = 1; i < H; i++) {
			for(int j = 1; j < W; j++) {
				if(G[i][j] == 1) {
					dp[i][j] = 0;
				}else {
					dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
					maxWidth = Math.max(maxWidth, dp[i][j]);
				}
			}
		}
		return maxWidth * maxWidth;
	}
}

