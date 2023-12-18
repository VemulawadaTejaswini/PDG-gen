

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] math;
	static final int MATH_LENGTH = 10;

	public static void main(String[] args) throws IOException {
		//変数の初期化
		math = new int[10][10];
		int x = 0, y = 0;
		int scale = 0;

		//入力値を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while (true) {
			inputStr = br.readLine();
			if (inputStr == null || inputStr.isEmpty()) {
				break;
			}
			//入力文字列を","で分割
			String[] inputSplitStr = inputStr.split(",");
			x = Integer.valueOf(inputSplitStr[0]);
			y = Integer.valueOf(inputSplitStr[1]);
			scale = Integer.valueOf(inputSplitStr[2]);

			// インキ滴が滲む範囲の計算
			switch (scale) {
			case 1: //インキ滴「小」
				setSmallInk(x, y);
				break;
			case 2: //インキ滴「中」
				setMediumInk(x, y);
				break;
			case 3: //インキ滴「大」
				setLargeInk(x, y);
				break;
			}
		}

		//塗りつぶしがないマスと最も濃いマスをカウント
		int whiteNumber = 0;
		int mostNumber = 0;
		for (int i = 0; i < MATH_LENGTH; i++) {
			for (int j = 0; j < MATH_LENGTH; j++) {
				if (math[i][j] == 0) {
					whiteNumber++;
				}
				if (mostNumber < math[i][j]) {
					mostNumber = math[i][j];
				}
			}
		}
		System.out.println(whiteNumber);
		System.out.println(mostNumber);
	}

	private static void setSmallInk(int x, int y) {
		//左
		if (0 <= x - 1) {
			math[x - 1][y]++;
		}
		//中上
		if (0 <= y - 1) {
			math[x][y - 1]++;
		}
		//中央
		math[x][y]++;
		//中下
		if (MATH_LENGTH > y + 1) {
			math[x][y + 1]++;
		}
		//右
		if (MATH_LENGTH > x + 1) {
			math[x + 1][y]++;
		}
	}

	/**
	 * [機能] インキ滴「中」のマスの塗りつぶし
	 * 
	 * @param x
	 * @param y
	 */
	private static void setMediumInk(int x, int y) {

		//左
		if (0 <= x - 1) {
			//左中
			math[x - 1][y]++;
			//左上
			if (0 <= y - 1) {
				math[x - 1][y - 1]++;
			}
			//左下
			if (MATH_LENGTH > y + 1) {
				math[x - 1][y + 1]++;
			}
		}

		//中上
		if (0 <= y - 1) {
			math[x][y - 1]++;
		}
		//中央
		math[x][y]++;
		//中下
		if (MATH_LENGTH > y + 1) {
			math[x][y + 1]++;
		}

		//右
		if (MATH_LENGTH > x + 1) {
			math[x + 1][y]++;
			//右上
			if (0 <= y - 1) {
				math[x + 1][y - 1]++;
			}
			//右下
			if (MATH_LENGTH > y + 1) {
				math[x + 1][y + 1]++;
			}
		}
	}

	private static void setLargeInk(int x, int y) {
		//中央
		math[x][y]++;
		//最左
		if (0 <= x - 2) {
			//最左中
			math[x - 2][y]++;
			//左中
			math[x - 1][y]++;
			//左上
			if (0 <= y - 1) {
				math[x - 1][y - 1]++;
			}
			//左下
			if (MATH_LENGTH > y + 1) {
				math[x - 1][y + 1]++;
			}
		} else if (0 <= x - 1) { //左
			//左中
			math[x - 1][y]++;
			//左上
			if (0 <= y - 1) {
				math[x - 1][y - 1]++;
			}
			//左下
			if (MATH_LENGTH > y + 1) {
				math[x - 1][y + 1]++;
			}
		}

		//最右
		if (MATH_LENGTH > x + 2) {
			//最右中
			math[x + 2][y]++;
			//右中
			math[x + 1][y]++;
			//右上
			if (0 <= y - 1) {
				math[x + 1][y - 1]++;
			}
			//右下
			if (MATH_LENGTH > y + 1) {
				math[x + 1][y + 1]++;
			}
		} else if (MATH_LENGTH > x + 1) { //右
			//右中
			math[x + 1][y]++;
			//右上
			if (0 <= y - 1) {
				math[x + 1][y - 1]++;
			}
			//左下
			if (MATH_LENGTH > y + 1) {
				math[x + 1][y + 1]++;
			}
		}

		//最上
		if (0 <= y - 2) {
			//最中上
			math[x][y - 2]++;
			//中上
			math[x][y - 1]++;
		} else if (0 <= y - 1) { //上
			//中上
			math[x][y - 1]++;
		}

		//最下
		if (MATH_LENGTH > y + 2) {
			//最中下
			math[x][y + 2]++;
			//中下
			math[x][y + 1]++;
		} else if (MATH_LENGTH > y + 1) {//中下
			//中下
			math[x][y + 1]++;
		}
	}
}