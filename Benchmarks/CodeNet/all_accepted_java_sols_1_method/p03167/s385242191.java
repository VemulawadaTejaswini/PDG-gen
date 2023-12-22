import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int height = scan.nextInt();
		int width = scan.nextInt();
		scan.nextLine();

		int[][][] dp = new int[height][width][2];

		for (int h = 0; h < height; h++) {

			String[] widthArray = scan.nextLine().split("");

			for (int w = 0; w < width; w++) {

				// 道：０　壁：１
				dp[h][w][0] = widthArray[w].equals(".")
						? 0
						: 1;
			}
		}

		// 開始地点は１通り
		dp[0][0][1] = 1;

		for (int h = 0; h < height; h++) {

			for (int w = 0; w < width; w++) {

				if (dp[h][w][0] == 0) {

					if (h == 0 && w == 0) {
						continue;

					} else if (h == 0) {

						dp[h][w][1] = dp[h][w - 1][1];

					} else if (w == 0) {

						dp[h][w][1] = dp[h - 1][w][1];

					} else {

						dp[h][w][1] = dp[h - 1][w][1] + dp[h][w - 1][1];
					}

					dp[h][w][1] = dp[h][w][1] % 1000000007;
				}
			}
		}

		System.out.println(dp[height - 1][width - 1][1]);
	}
}
