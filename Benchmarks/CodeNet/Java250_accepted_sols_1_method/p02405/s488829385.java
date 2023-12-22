import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();

			if (h == 0 && w == 0)
				break;
          
			// 偶行偶列
			if (h % 2 == 0 && w % 2 == 0) {
				for (int j = 0; j < h / 2; j++) { // 一行目と二行目の繰り返し
					for (int i = 0; i < w / 2; i++) {
						str.append("#.");
					}
					str.append("\n"); // 一行目を並べる

					for (int i = 0; i < w / 2; i++) {
						str.append(".#");
					}
					str.append("\n"); // 二行目を並べる
				}
			}

			// 偶行奇列
			if (h % 2 == 0 && w % 2 != 0) {
				for (int i = 0; i < h / 2; i++) { // 一行目と二行目の繰り返し

					str.append("#"); // 一行目の一文字目
					for (int j = 0; j < (w - 1) / 2; j++) { // 一行目の二文字目以降
						str.append(".#");
					}
					str.append("\n");

					str.append("."); // 二行目の一文字目
					for (int j = 0; j < (w - 1) / 2; j++) {
						str.append("#."); // 二行目の二文字目以降
					}
					str.append("\n");
				}
			}

			// 奇行偶列
			if (h % 2 != 0 && w % 2 == 0) {
				for (int i = 0; i < w/2; i++) {
					str.append("#."); // 一行目
				}
				str.append("\n");

				for (int j = 0; j < (h - 1) / 2; j++) { // 二行目と三行目の繰り返し

					for (int i = 0; i < w/2; i++) {
						str.append(".#"); // 二行目
					}
					str.append("\n");

					for (int i = 0; i < w/2; i++) {
						str.append("#."); // 三行目
					}
					str.append("\n");

				}
			}

			// 奇行奇列
			if (h % 2 != 0 && w % 2 != 0) {
				str.append("#"); // 最初の行の最初の文字
				for (int i = 0; i < (w - 1) / 2; i++) {
					str.append(".#"); // 二文字目からの繰り返し
				}
				str.append("\n");
				for (int j = 0; j < (h - 1) / 2; j++) { // 二行目と三行目の繰り返し

					str.append("."); // 二行目の行の最初の文字
					for (int i = 0; i < (w - 1) / 2; i++) {
						str.append("#."); // 二文字目からの繰り返し　　　　　　　　　　
					}
					str.append("\n");

					str.append("#"); // 三行目の行の最初の文字
					for (int i = 0; i < (w - 1) / 2; i++) {
						str.append(".#"); // 二文字目からの繰り返し
					}
					str.append("\n");
				}
			}
			str.append("\n");
		}
		System.out.print(str);
	}

}