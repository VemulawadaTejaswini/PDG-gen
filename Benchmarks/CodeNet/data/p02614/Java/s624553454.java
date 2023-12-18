

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int y = scan.nextInt();
		long n = scan.nextInt();
		int b = 0;
		String[][] moji = new String[t][y];
		for (int i = 0; i < t; i++) {
			String gyou = scan.next();
			for (int j = 0; j < y; j++) {
				moji[i][j] = String.valueOf(gyou.charAt(j));
				if (moji[i][j].equals("#")) {
					b++;
				}
			}
		}

		int ans = 0;

		if (n != b) {
			for (int i = 0; i < t; i++) {
				int tateb = 0;
				for (int j = 0; j < y; j++) {
					if (moji[i][j].equals("#")) {
						tateb++;
					}
				}

				for (int j = 0; j < y; j++) {
					int yokob = 0;
					for (int q = 0; q < t; q++) {
						if (moji[q][j].equals("#")) {
							yokob++;
						}
						if (moji[i][j].equals("#")) {
							yokob = yokob - 1;
						}
					}
					if (n == (b - tateb - yokob)) {
						ans++;
					}
				}

			}
		} else if (n == b) {
			ans = 1;
		}

		System.out.println(ans);

	}

}
