import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [機 能] マス目の紙にインクを落とし、色のついてないマスの数と最も濃いマス目の濃さを出力する機能
 * [説 明]
 * [備 考]
 */
public class Main {

	static final int MAX_LENGTH = 10;
	static final int MAX_WIDTH = 10;
	static final int SMALL_INK = 1;
	static final int MIDDLE_INK = 2;
	static final int LARGE_INK = 3;

	/**
	 * [機 能] マス目の紙にインクを落とし、色のついてないマスの数と最も濃いマス目の濃さを出力する機能
	 * [説 明]
	 * [備 考]
	 */
	public static void main(String[] args) {
		int field[][] = setField();
		//入力値を読み込む
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while (true) {
			try {
				input = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (input == null || input.isEmpty()) {
				break;
			}
			String[] inputs = input.split(",");
			//インクを落とす
			dropInk(field, Integer.parseInt(inputs[0]),
					Integer.parseInt(inputs[1]),
					Integer.parseInt(inputs[2]));
		}
		//色のついてないマスの数と最も濃いマス目の濃さを出力
		amountOfWhite(field);
		maxDepth(field);
	}

	/**
	 * [機 能] マス目の紙を用意する
	 * [説 明]
	 * [備 考] 今回マス目の紙をフィールドと呼ぶことにする
	 */
	private static int[][] setField() {
		int field[][] = new int[MAX_LENGTH][MAX_WIDTH];
		for (int i = 0; i < MAX_LENGTH; i++) {
			for (int j = 0; j < MAX_WIDTH; j++) {
				field[i][j] = 0;
			}
		}
		return field;
	}

	/**
	 * [機 能] 紙にインクを落とす機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 * @param x 紙の縦軸
	 * @param y 紙の横軸
	 * @param size インクのサイズ
	 */
	private static void dropInk(int[][] field, int x, int y, int size) {
		switch (size) {
		case SMALL_INK:
			dropSmall(field, x, y);
			break;
		case MIDDLE_INK:
			dropMiddle(field, x, y);
			break;
		case LARGE_INK:
			dropLarge(field, x, y);
			break;
		}
	}

	/**
	 * [機 能] 「大」サイズのインクを落とす機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 * @param x 紙の縦軸
	 * @param y 紙の横軸
	 */
	private static void dropLarge(int[][] field, int x, int y) {

		dropMiddle(field, x, y);

		int dropX[] = { -2, 0, 2, 0 };
		int dropY[] = { 0, -2, 0, 2 };

		for (int i = 0; i < dropX.length; i++) {
			dropping(field, x + dropX[i], y + dropY[i]);
		}
	}

	/**
	 * [機 能] 「中」サイズのインクを落とす機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 * @param x 紙の縦軸
	 * @param y 紙の横軸
	 */
	private static void dropMiddle(int[][] field, int x, int y) {

		dropSmall(field, x, y);

		int dropX[] = { -1, -1, 1, 1 };
		int dropY[] = { 1, -1, 1, -1 };

		for (int i = 0; i < dropX.length; i++) {
			dropping(field, x + dropX[i], y + dropY[i]);
		}
	}

	/**
	 * [機 能] 「小」サイズのインクを落とす機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 * @param x 紙の縦軸
	 * @param y 紙の横軸
	 */
	private static void dropSmall(int[][] field, int x, int y) {
		int dropX[] = { -1, 0, 1, 0 };
		int dropY[] = { 0, -1, 0, 1 };
		dropping(field, x, y);

		for (int i = 0; i < dropX.length; i++) {
			dropping(field, x + dropX[i], y + dropY[i]);
		}
	}

	/**
	 * [機 能] インクのしみこむ範囲が紙の外にはみ出ないか判定し、外であればしみこませない機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 * @param x 紙の縦軸
	 * @param y 紙の横軸
	 * @return field マス目の紙
	 */
	private static int[][] dropping(int[][] field, int x, int y) {
		if (0 <= x && x < 10 && 0 <= y && y < 10) {
			field[x][y] += 1;
		}
		return field;
	}

	/**
	 * [機 能] 色のついてないマスの数を出力する機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 */
	private static void amountOfWhite(int[][] field) {
		int count = 0;
		for (int i = 0; i < MAX_LENGTH; i++) {
			for (int j = 0; j < MAX_WIDTH; j++) {
				if (field[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	/**
	 * [機 能] 最も濃いマス目の濃さを出力する機能
	 * [説 明]
	 * [備 考]
	 * @param field マス目の紙
	 */
	private static void maxDepth(int[][] field) {
		int maxDepth = 0;
		for (int i = 0; i < MAX_LENGTH; i++) {
			for (int j = 0; j < MAX_WIDTH; j++) {
				if (maxDepth < field[i][j]) {
					maxDepth = field[i][j];
				}
			}
		}
		System.out.println(maxDepth);
	}
}