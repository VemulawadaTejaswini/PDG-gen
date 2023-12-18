import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {

	public static void main(String[] args) {
		int field[][] = setField();
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
			;
			String[] inputs = input.split(",");
			drop(field, Integer.parseInt(inputs[0]),
					Integer.parseInt(inputs[1]),
					Integer.parseInt(inputs[2]));
		}
		amountOfWhite(field);
		maxDepth(field);

	}

	private static int[][] setField() {
		int field[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				field[i][j] = 0;
			}
		}
		return field;
	}

	private static void drop(int[][] field, int x, int y, int size) {
		switch (size) {
		case 1:
			dropSmall(field, x, y);
			break;

		case 2:
			dropMiddle(field, x, y);
			break;
		case 3:
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
		if (0 <= x || x < 10 || 0 <= y || y < 10) {
			field[x][y] += 1;
		}
		return field;
	}

	private static void amountOfWhite(int[][] field) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (field[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static void maxDepth(int[][] field) {
		int maxDepth = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (maxDepth < field[i][j]) {
					maxDepth = field[i][j];
				}
			}
		}
		System.out.println(maxDepth);
	}
}