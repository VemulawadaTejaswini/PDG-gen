import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static final String RIGHT_TRIANGLE = "YES";
	private static final String NOT_RIGHT_TRIANGLE = "NO";

	/**
	 * <p>
	 * 与えられた三辺で直角三角形が作れるかを判定する。
	 * </p>
	 *
	 * @param args
	 *            利用しない。
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < lineCount; i++) {

			String[] input = br.readLine().split(" ");
			int[] side = { Integer.parseInt(input[0]),
					Integer.parseInt(input[1]), Integer.parseInt(input[2])};
			Arrays.sort(side);

			if (isRightTriangle(side[2], side[0], side[1])) {
				System.out.println(RIGHT_TRIANGLE);
			} else {
				System.out.println(NOT_RIGHT_TRIANGLE);
			}
		}
	}

	/**
	 * 三辺の長さから、直角三角形であるかどうかを判定する。<br>
	 * 注意：第一引数に最も長い辺を与えること。
	 *
	 * @param side1 辺1
	 * @param side2 辺2
	 * @param side3 辺3
	 * @return 直角三角形であるかどうか
	 */
	private static boolean isRightTriangle(int side1, int side2, int side3) {
		return (side1 * side1 == side2 * side2 + side3 * side3);
	}
}