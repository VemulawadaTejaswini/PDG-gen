package volume0;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	// 10*10のマス目からはみ出る場合を考慮し14*14のサイズを持つ
	private static int[][] square = new int[14][14];
	private static int SMALL_INK = 1;
	private static int LARGE_INK = 3;
	private static int ALIGNMENT = 2;

	/**
	 * 標準入力された値を受け取り、インクのサイズによって滲む範囲を切り分ける。
	 * すべての入力が終了した後にまだインクが滲んでいないマスの数と、最も濃いマスを判定し、出力する。
	 *
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int mostDeep = 0;
		int whiteTiles = 0;

		String[] inputString;
		String readLine = "";

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			readLine = input.next();

			// 受け取った一行をカンマ毎に区切る
			inputString = readLine.split(",", 0);

			inkPoint(Integer.parseInt(inputString[0]) + ALIGNMENT,
					Integer.parseInt(inputString[1]) + ALIGNMENT,
					Integer.parseInt(inputString[2]));

		}

		// 10*10のマス目を走査し、色がついていないマス数と最も濃いマスの濃さを調べる
		for (int i = 2; i < 12; i++) {
			for (int j = 2; j < 12; j++) {
				if (square[i][j] == 0) {
					whiteTiles++;
				} else {
					if (square[i][j] > mostDeep) {
						mostDeep = square[i][j];
					}
				}
			}
		}
		System.out.println(whiteTiles + "\r\n" + mostDeep);
	}

	/**
	 * squareの2?12マスにインクを落とす
	 *
	 * @param x
	 * @param y
	 * @param inkSize
	 */
	static void inkPoint(int x, int y, int inkSize) {

		square[x][y - 1]++;
		square[x - 1][y]++;
		square[x][y]++;
		square[x + 1][y]++;
		square[x][y + 1]++;

		if (inkSize != SMALL_INK) {
			square[x - 1][y - 1]++;
			square[x + 1][y - 1]++;
			square[x - 1][y + 1]++;
			square[x + 1][y + 1]++;
		}

		if (inkSize == LARGE_INK) {
			square[x][y - 2]++;
			square[x - 2][y]++;
			square[x + 2][y]++;
			square[x][y + 2]++;
		}
	}
}