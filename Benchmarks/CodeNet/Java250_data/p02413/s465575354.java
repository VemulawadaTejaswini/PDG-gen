import java.util.Scanner;

public class Main {
	/*
	 * 表計算
	 *
	 * 表計算を行う簡単なプログラムを作成します。
	 *
	 * 表の行数rと列数c、r × c の要素を持つ表を読み込んで、各行と列の合計を挿入した新しい表を出力するプログラムを作成して下さい。
	 *
	 * Input 最初の行にrとcが空白区切りで与えられます。続くr行にそれぞれc個の整数が空白区切りで与えられます。
	 *
	 * Output (r+1) × (c+1)
	 * の新しい表を出力して下さい。各行の隣り合う整数は１つの空白で区切って下さい。各行の最後の列としてその行の合計値を
	 * 、各列の最後の行としてその列の合計値を、最後の行・列に表全体の合計値を挿入して下さい。
	 *
	 * Constraints 1 ? r, c ? 100
	 */
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] array = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				array[i][j] = sc.nextInt();
				array[i][c] += array[i][j];
				array[r][j] += array[i][j];
			}
		}

		for (int i = 0; i < c; i++) {
			array[r][c] += array[r][i];
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if (j >= 0 && j < array[i].length -1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}