import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 表の行数r、列数cの数値を取得
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		// 表のサイズ+1の2次元配列をつくる
		int[][] sheet = new int[r + 1][c + 1];

		// 表中の数の入力準備
		int n;
		// 合計値をsumとする
		int sum = 0;

		for (int row = 0; row < r + 1; row++) {
			for (int column = 0; column < c + 1; column++) {

				// 最終行でないときの処理
				if (!(row == r)) {
					// 最終列のときsumを2次元配列に入れる
					if (column == c) {
						sheet[row][column] = sum;
						sum = 0;
					}

					if (column < c) {
						// 表中の数の入力
						n = sc.nextInt();
						// 2次元配列に入力値nを入れる
						sheet[row][column] = n;
						// 合計値sumに入力値nを足す
						sum = sum + n;
					}
				}

				// 最終行のときの処理
				if (row == r) {
					for (column = 0; column < c + 1; column++) {
						for (row = 0; row < r + 1; row++) {
							sum = sum + sheet[row][column];
							if (row == r) {
								sheet[row][column] = sum;
								sum = 0;
							}
						}
					}
				}
			}
		}

		// 表を出力する
		for (int row = 0; row < r + 1; row++) {
			for (int column = 0; column < c + 1; column++) {
				System.out.print(sheet[row][column]);
				if (!(column == c)) {
					System.out.print(" ");
				}
				if (column == c) {
					System.out.println("");
				}
			}
		}
	}

}

