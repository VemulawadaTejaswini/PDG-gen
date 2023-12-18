import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int scale;
	static int[][] math;
	static final int MATH_LENGTH = 10;

	static void init() {
		scale = 0;
		math = new int[10][10];
	}

	public static void main(String[] args) {
		//?????°????????????
		init();
		int x = 0, y = 0;

		//??\???????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String inputStr = null;
			try {
				inputStr = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (inputStr == null || inputStr.isEmpty()) {
				break;
			}
			//??\???????????????","??§??????
			String[] inputSplitStr = inputStr.split(",");
			x = Integer.valueOf(inputSplitStr[0]);
			y = Integer.valueOf(inputSplitStr[1]);
			scale = Integer.valueOf(inputSplitStr[2]);

			// ???????????´???????????????????¨????
			switch (scale) {
			case 1: //???????????´????°????
				setSmallInk(x, y);
				break;
			case 2: //???????????´?????????
				setMediumInk(x, y);
				break;
			case 3: //???????????´?????§???
				setLargeInk(x, y);
				break;
			}
		}
		//???????????¶????????????????????¨?????????????????????????????????
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
		if ((x - 1) >= 0 && (x + 1) < MATH_LENGTH && (y - 1) >= 0 && (y + 1) < MATH_LENGTH) {
			math[x - 1][y]++;

			math[x][y - 1]++;
			math[x][y]++;
			math[x][y + 1]++;

			math[x + 1][y]++;
		}
	}

	private static void setMediumInk(int x, int y) {
		if ((x - 1) >= 0 && (x + 1) < MATH_LENGTH && (y - 1) >= 0 && (y + 1) < MATH_LENGTH) {
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
	}

	private static void setLargeInk(int x, int y) {
		if ((x - 2) >= 0 && (x + 2) < MATH_LENGTH && (y - 2) >= 0 && (y + 2) < MATH_LENGTH
				|| (x - 1) >= 0 && (x + 1) < MATH_LENGTH && (y - 1) >= 0 && (y + 1) < MATH_LENGTH) {

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
}