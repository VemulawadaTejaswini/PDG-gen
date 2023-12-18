import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int[][] grid = new int[5][5]; // G[WFgÌs®ÌæÆ

	int[][] wallV = new int[4][5];

	int[][] wallH = new int[5][4];



	boolean canDown(int x, int ny) {

		int y = ny;

		if (x < 0 || y < 0 || x > 4 || y > 3) {

			return false;

		}

		if (wallV[y][x] == 1) {

			return true;

		}

		return false;

	}



	boolean canUp(int x, int ny) {

		int y = ny - 1;

		if (x < 0 || y < 0 || x > 4 || y > 3) {

			return false;

		}

		if (wallV[y][x] == 1) {

			return true;

		}

		return false;

	}



	boolean canRight(int nx, int y) {

		int x = nx;

		if (x < 0 || y < 0 || x > 3 || y > 4) {

			return false;

		}

		if (wallH[y][x] == 1) {

			return true;

		}

		return false;

	}



	boolean canLeft(int nx, int y) {

		int x = nx - 1;

		if (x < 0 || y < 0 || x > 3 || y > 4) {

			return false;

		}

		if (wallH[y][x] == 1) {

			return true;

		}

		return false;

	}



	void run() {

		String buffer = sc.nextLine();

		for (int j = 0; j < 4; j++) {

			wallH[0][j] = buffer.charAt(j) - '0';

		}



		for (int i = 0; i < 4; i++) {

			buffer = sc.nextLine();

			for (int j = 0; j < 5; j++) {

				wallV[i][j] = buffer.charAt(j) - '0';

			}

			buffer = sc.nextLine();

			for (int j = 0; j < 4; j++) {

				wallH[i + 1][j] = buffer.charAt(j) - '0';

			}

		}

		int x = 0;

		int y = 0;

		int dirc = 0;

		boolean a = true;

		String Ans = "";

		for (; a || !(x == 0 && y == 0);) {

			a = false;

//			System.out.println(Ans);

			if (dirc == 0) {

				if (canUp(x, y)) {

					Ans += "U";

					y -= 1;

					dirc = 1;

					continue;

				}

				if (canRight(x, y)) {

					Ans += "R";

					x += 1;

					dirc = 0;

					continue;

				}

				if (canDown(x, y)) {

					Ans += "D";

					y += 1;

					dirc = 3;

					continue;

				}

				if (canLeft(x, y)) {

					Ans += "L";

					x -= 1;

					dirc = 2;

					continue;

				}

			}

			if (dirc == 1) {

				if (canLeft(x, y)) {

					Ans += "L";

					x -= 1;

					dirc = 2;

					continue;

				}

				if (canUp(x, y)) {

					Ans += "U";

					y -= 1;

					dirc = 1;

					continue;

				}

				if (canRight(x, y)) {

					Ans += "R";

					x += 1;

					dirc = 0;

					continue;

				}

				if (canDown(x, y)) {

					Ans += "D";

					y += 1;

					dirc = 3;

					continue;

				}

			}

			if (dirc == 2) {

				if (canDown(x, y)) {

					Ans += "D";

					y += 1;

					dirc = 3;

					continue;

				}

				if (canLeft(x, y)) {

					Ans += "L";

					x -= 1;

					dirc = 2;

					continue;

				}

				if (canUp(x, y)) {

					Ans += "U";

					y -= 1;

					dirc = 1;

					continue;

				}

				if (canRight(x, y)) {

					Ans += "R";

					x += 1;

					dirc = 0;

					continue;

				}

			}

			if (dirc == 3) {

				if (canRight(x, y)) {

					Ans += "R";

					x += 1;

					dirc = 0;

					continue;

				}

				if (canDown(x, y)) {

					Ans += "D";

					y += 1;

					dirc = 3;

					continue;

				}

				if (canLeft(x, y)) {

					Ans += "L";

					x -= 1;

					dirc = 2;

					continue;

				}

				if (canUp(x, y)) {

					Ans += "U";

					y -= 1;

					dirc = 1;

					continue;

				}

			}

		}

		System.out.println(Ans);

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}