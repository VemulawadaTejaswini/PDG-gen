import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/** 区切り文字 */
	static final String REGEX = ",";

	/** インキ滴の小 */
	static final int SMALL_SIZE = 1;

	/** インキ滴の中 */
	static final int MIDIAM_SIZE = 2;

	/** インキ滴の大 */
	static final int LARGE_SIZE = 3;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int[] field = new int[101];
		int x;
		int y;
		int size;
		while (true) {
			String line = reader.readLine();
			if (line == null || line.isEmpty()) {
				break;
			}
			String[] str = line.split(REGEX);
			x = Integer.valueOf(str[0]);
			y = Integer.valueOf(str[1]);
			size = Integer.valueOf(str[2]);
			--x;
			--y;

			switch (size) {
			case SMALL_SIZE:
				field[calcIndex(x - 1, y)] += 1;
				field[calcIndex(x, y + 1)] += 1;
				field[calcIndex(x, y)] += 1;
				field[calcIndex(x, y - 1)] += 1;
				field[calcIndex(x + 1, y)] += 1;
				break;
			case MIDIAM_SIZE:
				field[calcIndex(x - 1, y + 1)] += 1;
				field[calcIndex(x - 1, y)] += 1;
				field[calcIndex(x - 1, y - 1)] += 1;
				field[calcIndex(x, y + 1)] += 1;
				field[calcIndex(x, y)] += 1;
				field[calcIndex(x, y - 1)] += 1;
				field[calcIndex(x + 1, y + 1)] += 1;
				field[calcIndex(x + 1, y)] += 1;
				field[calcIndex(x + 1, y - 1)] += 1;
				break;
			case LARGE_SIZE:
				field[calcIndex(x - 2, y)] += 1;
				field[calcIndex(x - 1, y + 1)] += 1;
				field[calcIndex(x - 1, y)] += 1;
				field[calcIndex(x - 1, y - 1)] += 1;
				field[calcIndex(x, y + 2)] += 1;
				field[calcIndex(x, y + 1)] += 1;
				field[calcIndex(x, y)] += 1;
				field[calcIndex(x, y - 1)] += 1;
				field[calcIndex(x, y - 2)] += 1;
				field[calcIndex(x + 1, y + 1)] += 1;
				field[calcIndex(x + 1, y)] += 1;
				field[calcIndex(x + 1, y - 1)] += 1;
				field[calcIndex(x + 2, y)] += 1;
				break;
			default:
			}
		}

		int count = 0;
		int max = 0;
		for (int i = 0; i < 100; i++) {
			if (field[i] == 0) {
				count++;
			}
			if (field[i] > max) {
				max = field[i];
			}
		}

		System.out.println(count);
		System.out.println(max);
	}

	/**
	 * x座標とy座標を受け取って、配列のインデックスを返却する。
	 *
	 * @param x x座標
	 * @param y y座標
	 * @return 配列のインデックス
	 */
	private static int calcIndex(int x, int y) {
		if (x < 0 || y < 0 || x > 9 || y > 9) {
			return 100;
		}
		return x * 10 + y;
	}
}