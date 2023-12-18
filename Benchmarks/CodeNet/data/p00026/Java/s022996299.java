import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int MAX_LENGTH = 10;
	static final int MAX_WIDTH = 10;
	static final int SMALL_INK = 1;
	static final int MIDDLE_INK = 2;
	static final int LARGE_INK = 3;

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

	private static int[][] setField() {
		int field[][] = new int[MAX_LENGTH][MAX_WIDTH];
		for (int i = 0; i < MAX_LENGTH; i++) {
			for (int j = 0; j < MAX_WIDTH; j++) {
				field[i][j] = 0;
			}
		}
		return field;
	}

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

	private static void dropLarge(int[][] field, int x, int y) {

		dropMiddle(field, x, y);

		int dropX[] = { -2, 0, 2, 0 };
		int dropY[] = { 0, -2, 0, 2 };

		for (int i = 0; i < dropX.length; i++) {
			dropping(field, x + dropX[i], y + dropY[i]);
		}
	}

	private static void dropMiddle(int[][] field, int x, int y) {

		dropSmall(field, x, y);

		int dropX[] = { -1, -1, 1, 1 };
		int dropY[] = { 1, -1, 1, -1 };

		for (int i = 0; i < dropX.length; i++) {
			dropping(field, x + dropX[i], y + dropY[i]);
		}
	}

	private static void dropSmall(int[][] field, int x, int y) {
		int dropX[] = { -1, 0, 1, 0 };
		int dropY[] = { 0, -1, 0, 1 };
		dropping(field, x, y);

		for (int i = 0; i < dropX.length; i++) {
			dropping(field, x + dropX[i], y + dropY[i]);
		}
	}

	private static int[][] dropping(int[][] field, int x, int y) {
		if (0 <= x && x < 10 && 0 <= y && y < 10) {
			field[x][y] += 1;
		}
		return field;
	}

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