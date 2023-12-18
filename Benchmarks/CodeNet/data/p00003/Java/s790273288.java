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
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < lineCount; i++) {

			String[] input = br.readLine().split(" ");
			int[] side = { Integer.parseInt(input[0]),
					Integer.parseInt(input[1]), Integer.parseInt(input[2])};
			Arrays.sort(side);

			if (side[2] * side[2] == side[0] * side[0] + side[1] * side[1]) {
				System.out.println(RIGHT_TRIANGLE);
			} else {
				System.out.println(NOT_RIGHT_TRIANGLE);
			}
		}
	}
}