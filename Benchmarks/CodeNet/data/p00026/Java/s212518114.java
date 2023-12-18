package volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int[][] square = new int[10][10];
	private static int mostDeep = 0;
	private static int whiteTiles = 0;

	/**
	 * 標準入力された値を受け取り、インクのサイズによって滲む範囲を切り分ける。
	 * すべての入力が終了した後にまだインクが滲んでいないマスの数と、最も濃いマスを判定し、出力する。
	 *
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String[] inputString;
		String readLine = "";

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {

			readLine = input.readLine();

			// 入力が終了した場合にループ処理を終了させる。
			if (readLine.equals("")) {
				break;
			}

			// 受け取った一行をカンマ毎に区切る
			inputString = readLine.split(",", 0);

			switch (Integer.parseInt(inputString[2])) {
			case 1:
				smallInk(Integer.parseInt(inputString[0]),
						Integer.parseInt(inputString[1]));
				break;
			case 2:
				mediumInk(Integer.parseInt(inputString[0]),
						Integer.parseInt(inputString[1]));
				break;
			case 3:
				largeInk(Integer.parseInt(inputString[0]),
						Integer.parseInt(inputString[1]));
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
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
	 * インクが小の場合の処理
	 *
	 * @param x
	 * @param y
	 */
	static void smallInk(int x, int y) {

		if (x - 1 >= 0) {
			square[x - 1][y]++;
		}

		if (x + 1 <= 9) {
			square[x + 1][y]++;
		}

		square[x][y]++;

		if (y - 1 >= 0) {
			square[x][y - 1]++;
		}

		if (y + 1 <= 9) {
			square[x][y + 1]++;
		}

	}

	/**
	 * インクが中の場合の処理
	 *
	 * @param x
	 * @param y
	 */
	static void mediumInk(int x, int y) {

		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (x >= 0 && x <= 10) {
					square[i][j]++;
				}
			}
		}
	}

	/**
	 * インクが大の場合の処理
	 *
	 * @param x
	 * @param y
	 */
	static void largeInk(int x, int y) {

		if (x - 2 >= 0) {
			square[x - 2][y]++;
		}

		if (x + 2 <= 9) {
			square[x + 2][y]++;
		}

		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (x >= 0 && x <= 10) {
					square[i][j]++;
				}
			}
		}

		if (y - 2 >= 0) {
			square[x][y - 2]++;
		}

		if (y + 2 <= 9) {
			square[x][y + 2]++;
		}
	}
}