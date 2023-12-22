import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] s = new String[h][w];
		String ans = "Yes";

		for (int i = 0; i < h; i++) {
			String line = sc.next();
			for (int j = 0; j < w; j++) {
				s[i][j] = line.substring(j, j + 1);
			}
		}
		
		loop1:
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				// System.out.println(s[i][j]);
				if (s[i][j].equals("#")) {
				int sum = 0;
				// 上を数える
				if (i > 0) {
					if (s[i - 1][j].equals("#")) {
						sum++;
					}
				}
				// 下を数える
				if (i < h - 1) {
					if (s[i + 1][j].equals("#")) {
						sum++;
					}
				}
				// 左を数える
					if (j > 0) {
						if (s[i][j - 1].equals("#")) {
							sum++;
						}
					}
				// 右を数える
				if (j < w - 1) {
					if (s[i][j + 1].equals("#")) {
						sum++;
					}
				}
				if (sum == 0) {
					ans = "No";
					break loop1;
				}
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
