import java.util.Scanner;

public class Main {
	private static final int Y = 1;
	private static final int X = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][][] t = new int[100][100][2];
		int n;
		while ((n = in.nextInt()) > 0) {
			// System.out.println("n=" + n);
			for (int y = 0; y < n; y++) {
				for (int x = 0; x < n; x++) {
					t[x][y][X] = in.nextInt();
					t[x][y][Y] = in.nextInt();
				}
			}
			int count = 0;
			int stepNum = 0;
			for (int startX = 0; startX < n; startX++) {
				for (int startY = 0; startY < n; startY++) {
					stepNum -= 1;
					int posiX = startX, posiY = startY;
					int nextX = t[posiX][posiY][X], nextY = t[posiX][posiY][Y];
					while (nextX >= 0) {
						t[posiX][posiY][X] = stepNum;
						posiX = nextX;
						posiY = nextY;
						nextX = t[posiX][posiY][X];
						nextY = t[posiX][posiY][Y];
						if (nextX == stepNum) {
							count++;
						}
					}

				}
			}
			// for (int x = 0; x < n; x++) {
			// for (int y = 0; y < n; y++) {
			// System.out.print(t[x][y][X] + " ");
			// }
			// System.out.println();
			// }
			System.out.println(count);
		}
	}
}