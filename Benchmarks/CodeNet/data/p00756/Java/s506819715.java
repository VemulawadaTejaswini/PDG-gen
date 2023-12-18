import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			int[][] cir = new int[n][4];
			int[] above = new int[n];// 上に重なってる円盤

			int[] bitDP = new int[1 << n];

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int r = sc.nextInt();
				int c = sc.nextInt();
				cir[i][0] = x;
				cir[i][1] = y;
				cir[i][2] = r;
				cir[i][3] = c;

				for (int j = 0; j < i; j++) {
					// 重なっている円盤があるかの判定
					int jx = cir[j][0] - x;
					int jy = cir[j][1] - y;
					int jr = cir[j][2];
					double dist = Math.sqrt(jx * jx + jy * jy);
					if (dist < r + jr) {
						above[i] += (1 << j);
					}
				}
			}

			int max = 0;
			for (int bit = 0; bit < bitDP.length; bit++) {
				for (int i = 0; i < n; i++) {
					for (int j = i + 1; j < n; j++) {
						// 到達しうる遷移か
						if (bit != 0 && bitDP[bit] == 0) {
							continue;
						}
						// 円iとjが取り除かれていないかチェック
						if ((bit & ((1 << i) + (1 << j))) != 0) {
							continue;
						}
						// iとjの上に載っている円が全部取り除かれている
						if ((above[i] & bit) != above[i] || (above[j] & bit) != above[j]) {
							continue;
						}
						// 色が一緒かどうか
						if (cir[i][3] == cir[j][3]) {
							int newbit = bit + (1 << i) + (1 << j);
							bitDP[newbit] = Math.max(bitDP[newbit], bitDP[bit] + 2);
							max = Math.max(max, bitDP[newbit]);
						}
					}
				}
			}

			System.out.println(max);

		}
	}
}