import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// 標準入力より値Hを取得
		int maxLine = sc.nextInt() - 1;

		// 標準入力より値Wを取得
		int maxRow = sc.nextInt() - 1;

		// 標準入力より値hを取得
		int line = sc.nextInt() - 1;

		// 標準入力より値wを取得
		int row = sc.nextInt() - 1;

		// int型2次元配列 [行：H 列：W] [値0：白 値1：黒]
		int[][] arrayInt = new int[maxLine][maxRow];

		// 行の処理
		// 1行目からh行目までの要素の値を1(黒)にする
		// forループ 0から、h-1まで
		for (int i = 0; i < line; i++) {
			// forループ 0から、W-1まで
			for (int j = 0; j < maxRow; j++) {
				// 要素の値に1を代入
				arrayInt[i][j] = 1;
			}
		}

		// 列の処理
		// 1列目からw行までの要素の値を1(黒)にする
		// forループ 0から、H-1まで
		for (int i = 0; i < maxLine; i++) {
			// forループ 0から、w-1まで
			for (int j = 0; j < row; j++) {
				// 要素の値に1を代入
				arrayInt[i][j] = 1;
			}
		}

		// 要素0(白)の数を判定
		// カウンタ変数を0に設定
		int counter = 0;
		// forループ 0から、H-1まで
		for (int i = 0; i < maxLine; i++) {
			// forループ 0から、W-1まで
			for (int j = 0; j < maxRow; j++) {
				// if文 値が0の時、カウンタ変数をインクリメント
				if (arrayInt[i][j] == 0) {
					counter++;
				}
			}
		}

		// カウンタ変数を出力
		System.out.println(counter);
		sc.close();
	}
}
