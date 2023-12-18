import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[14][14];
		int x = 0;
		int y = 0;
		int size = 0;
		int blank = 0;
		int maxValue = 0;

		while (sc.hasNext()) {
			String inputData[] = sc.next().split(",");

			x = Integer.parseInt(inputData[0]) + 2;
			y = Integer.parseInt(inputData[1]) + 2;
			size = Integer.parseInt(inputData[2]);

			switch (size) {
			case 1:
				spillInk1(x, y, matrix);

				break;
			case 2:
				spillInk2(x, y, matrix);

				break;
			case 3:
				spillInk3(x, y, matrix);
			}

		}

		for (int i = 2; i < 12; i++) {
			for (int j = 2; j < 12; j++) {
				if (matrix[i][j] == 0) {
					blank++;
				}
				if (maxValue < matrix[i][j]) {
					maxValue = matrix[i][j];
				}
			}
		}

		System.out.println(blank);
		System.out.println(maxValue);
	}

	static int[][] spillInk1(int x, int y, int[][] matrix) {
		matrix[x][y]++;
		matrix[x + 1][y]++;
		matrix[x - 1][y]++;
		matrix[x][y + 1]++;
		matrix[x][y - 1]++;

		return matrix;
	}

	static int[][] spillInk2(int x, int y, int[][] matrix) {
		spillInk1(x, y, matrix);

		matrix[x + 1][y + 1]++;
		matrix[x - 1][y - 1]++;
		matrix[x + 1][y - 1]++;
		matrix[x - 1][y + 1]++;

		return matrix;
	}

	static int[][] spillInk3(int x, int y, int[][] matrix) {
		spillInk2(x, y, matrix);

		matrix[x][y + 2]++;
		matrix[x][y - 2]++;
		matrix[x + 2][y]++;
		matrix[x - 2][y]++;

		return matrix;
	}

}