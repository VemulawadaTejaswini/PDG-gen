import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] math;
	static final int MATH_LENGTH = 12;

	public static void main(String[] args) throws IOException {
		//?????°????????????
		math = new int[14][14];
		int x = 0, y = 0;
		int scale;

		//??\???????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while (true) {
			inputStr = br.readLine();
			if (inputStr.isEmpty() || inputStr == null)
				break;
			//??\???????????????","??§??????
			String[] inputSplitStr = inputStr.split(",");
			x = Integer.valueOf(inputSplitStr[0]);
			y = Integer.valueOf(inputSplitStr[1]);
			scale = Integer.valueOf(inputSplitStr[2]);

			// ???????????´???????????????????¨????
			switch (scale) {
			case 1: //???????????´????°????
				setSmallInk(x + 2, y + 2);
				break;
			case 2: //???????????´?????????
				setMediumInk(x + 2, y + 2);
				break;
			case 3: //???????????´?????§???
				setLargeInk(x + 2, y + 2);
				break;
			}
		}

		//???????????¶????????????????????¨?????????????????????????????????
		int whiteNumber = 0;
		int mostNumber = 0;
		for (int i = 2; i < MATH_LENGTH; i++) {
			for (int j = 2; j < MATH_LENGTH; j++) {
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
		math[x - 1][y]++;
		math[x][y - 1]++;
		math[x][y]++;
		math[x][y + 1]++;
		math[x + 1][y]++;
	}

	private static void setMediumInk(int x, int y) {
		math[x - 1][y - 1]++;
		math[x - 1][y]++;
		math[x - 1][y + 1]++;
		math[x][y - 1]++;
		math[x][y]++;
		math[x][y + 1]++;
		math[x + 1][y - 1]++;
		math[x + 1][y]++;
		math[x + 1][y + 1]++;
	}

	private static void setLargeInk(int x, int y) {
		System.out.println(x + " " + y);
		math[x - 2][y]++;
		math[x - 1][y - 1]++;
		math[x - 1][y]++;
		math[x - 1][y + 1]++;
		math[x][y - 2]++;
		math[x][y - 1]++;
		math[x][y]++;
		math[x][y + 1]++;
		math[x][y + 2]++;
		math[x + 1][y - 1]++;
		math[x + 1][y]++;
		math[x + 1][y + 1]++;
		math[x + 2][y]++;
	}
}