import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int ORIGIN_POINT_X = 0;
	private static final int ORIGIN_POINT_Y = 0;

	public static void main(String[] args) {
		//
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int[] inputIntArr = null;
		try {
			String[] inputStrArr = (input.readLine()).split(" ");
			inputIntArr = new int[inputStrArr.length];
			for(int i = 0; i < inputIntArr.length; i++) {
				inputIntArr[i] = Integer.parseInt(inputStrArr[i]);
			}

			if (judgeWidth(inputIntArr[2], inputIntArr[4], inputIntArr[0]) && judgeHeight(inputIntArr[3], inputIntArr[4], inputIntArr[1] )) {
				System.out.println("Yes");

			} else {
				System.out.println("No");
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static boolean judgeWidth(int x, int r, int W) {
		boolean judgeWidth = false;
		if (((x - r) < ORIGIN_POINT_X ) || ((x + r) > W )) {
			judgeWidth = false;
		} else if (((x - r) >= ORIGIN_POINT_X ) && ((x + r) <= W )) {
			judgeWidth = true;
		}
		return judgeWidth;
	}

	public static boolean judgeHeight(int y, int r, int H) {
		boolean judgeHeight = false;
		if (((y - r) < ORIGIN_POINT_Y ) || ((y + r) > H )) {
			judgeHeight = false;
		} else if (((y - r) >= ORIGIN_POINT_Y ) && ((y + r) <= H )) {
			judgeHeight = true;
		}
		return judgeHeight;
	}

}

