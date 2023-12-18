import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		//渡される定数
		int r = sc.nextInt();//行数
		int c = sc.nextInt();//列数

		//配列の用意
		int[][] excel = new int[r + 1][c + 1];//結果分を出さなければいけないので行列を1ずつ増やす

		//要素の入力
		for (int i = 0; i < r; i++) {//行rの何行目かを指定
			for (int j = 0; j < c; j++) {//列cの何列目かを指定
				excel[i][j] = sc.nextInt();//行列番地用意
				excel[r][j] += excel[i][j];//行を固定
				excel[i][c] += excel[i][j];//列を固定

			}

		}

		//行の計算
		for (int i = 0; i < c; i++) {//行rの何行目かを指定
			excel[r][c] += excel[r][i];
		}
		//		//列の計算
		//		for (int j = 0; j < r; j++) {//行rの何行目かを指定
		//			excel[r][c] += excel[j][c];//何列目の合計値
		//		}
		//
		//表として出力
		for (int i = 0; i < excel.length; i++) {//行
			for (int j = 0; j < excel[i].length; j++) {//i行の列
				System.out.print(excel[i][j]);
				if (j != c) {
					System.out.print(" ");//表の数字の間にスペースを挟む
				}
			}
			System.out.println();
		}

	}
}
