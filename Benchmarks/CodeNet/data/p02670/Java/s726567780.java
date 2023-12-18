import java.util.*;
public class Main {
	//模範解答の理解度確認
	static int[][] seat;
	static int[][] hate;
	static int n;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		n = Integer.parseInt(lineString[0]);
		seat = new int[n][n];
		hate = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				seat[i][j] = 1;
				hate[i][j] = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
			}
		}

		lineString = sc.nextLine().split(" ");
		int hateCount = 0;
		for (int i = 0; i < n * n; i++) {
			int number = Integer.parseInt(lineString[i]) - 1;
			int row = number / n;
			int column = number % n;

			hateCount += hate[row][column];
			seat[row][column] = 0;

			hateCalc(row, column);
		}

		// 出力
		System.out.println(hateCount);
		sc.close();
	}

	static void hateCalc(int currentRow, int currentColumn) {
		int currentHate = hate[currentRow][currentColumn] + seat[currentRow][currentColumn];	//他からこの座標に来たときの、ここからのhateカウント。
		//前後左右のやり方も今後パクる
		int[] x = {1, 0, -1, 0};
		int[] y = {0, 1, 0, -1};

		for (int i = 0; i < 4; i++) {
			try {
				if (hate[currentRow + y[i]][currentColumn - x[i]] > currentHate) {
					//自分を通ることで、隣のhateが減る場合は、そちらを採用。
					hate[currentRow + y[i]][currentColumn - x[i]] = currentHate;
					//hateが変動した席も再計算。
					hateCalc(currentRow + y[i], currentColumn - x[i]);	//
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				//配列外の探索はしない。
			}
		}
	}
}
