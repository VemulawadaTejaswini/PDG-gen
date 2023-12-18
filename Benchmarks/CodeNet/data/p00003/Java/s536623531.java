import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

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
			int side1 = Integer.parseInt(input[0]);
			int side2 = Integer.parseInt(input[1]);
			int side3 = Integer.parseInt(input[2]);

			if (isRightTriangle(side1, side2, side3)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	/**
	 * 三辺の長さから、直角三角形であるかどうかを判定する。<br>
	 * 注意：第一引数に最も長い辺を与えること。
	 *
	 * @param side1
	 *            辺1
	 * @param side2
	 *            辺2
	 * @param side3
	 *            辺3
	 * @return 直角三角形であるかどうか
	 */
	private static boolean isRightTriangle(int side1, int side2, int side3) {

		boolean isRightTriangle = false;
		if (side1 >= side2 && side1 >= side3) {
			isRightTriangle = (side1 * side1 == side2 * side2 + side3 * side3);
		} else if (side2 >= side1 && side2 >= side3) {
			isRightTriangle = (side2 * side2 == side1 * side1 + side3 * side3);
		} else {
			isRightTriangle = (side3 * side3 == side1 * side1 + side2 * side2);
		}

		return isRightTriangle;
	}
}