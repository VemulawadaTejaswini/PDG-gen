import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);


		// 行と列を取得
		int H = scanner.nextInt();
		int W = scanner.nextInt();

		// キャンバスを保持する配列を生成
		String[][] table = new String[H + 2][W + 2];


		// キャンバスを.で初期化
		for (int i = 0; i <= H + 1; i++) {
			for (int j = 0; j <= W + 1; j++) {
				table[i][j] = ".";
			}
		}

		// 標準入力から読み込んだ値をキャンバスに設定
		for (int i = 1; i <= H; i++) {
			String line = scanner.next();
			for (int j = 1; j <= W; j++) {
				table[i][j] = line.substring(j-1, j);
			}
		}

		// 判定
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if (table[i][j].equals("#")) {
					if (table[i - 1][j].equals(".") && table[i + 1][j].equals(".") && table[i][j - 1].equals(".") && table[i][j + 1].equals(".")) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
