import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String steps = scan.next();
			if (steps.equals("#")) {
				scan.close();
				break;
			}
			int N = steps.length();
			int[] table = new int[N];
			for (int i = 0; i < table.length; i++) {
				table[i] = Character.getNumericValue(steps.charAt(i));
			}
			// i文字目をkで踏んだ時の踏める回数
			// 右の時k=0、左の時k=1
			int[][] dp = new int[N][2];

			for (int i = 1; i < N; i++) {
				if ((table[i] - 1) % 3 > (table[i - 1] - 1) % 3) {
					// i-1番目が左だったらセーフ
					// i番目がi-1番目より右だった時
					dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][0] + 1);
					dp[i][1] = Integer.MAX_VALUE - 1;// 左で踏むことは絶対にない
				} else if ((table[i] - 1) % 3 < (table[i - 1] - 1) % 3) {
					// i番目がi-1番目より左だった時
					dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1] + 1);
					dp[i][0] = Integer.MAX_VALUE - 1;
				} else {
					dp[i][1] = dp[i - 1][0];
					dp[i][0] = dp[i - 1][1];
				}
			}

			System.out.println(Math.min(dp[N - 1][0], dp[N - 1][1]));
		}

	}
}