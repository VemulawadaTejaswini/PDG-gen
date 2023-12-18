import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void exp(int map[][], int x, int y) {

		int[] dx = { 0, 0, 0, 0, 0, 0, 1, 2, 3, -1, -2, -3 };

		int[] dy = { 1, 2, 3, -1, -2, -3, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < dx.length; i++) {

			if (map[x + dx[i]][y + dy[i]] == 1) {

				map[x + dx[i]][y + dy[i]] = 0;

				exp(map, x + dx[i], y + dy[i]);

			}

		}

	}



	void run() {

		int n = sc.nextInt();

		for (int c = 1; c <= n; c++) {

			int[][] map = new int[14][14];

			for (int i = 0; i < 8; i++) {

				String buffer = sc.nextLine();

				for (; buffer.length() == 0;)

					buffer = sc.nextLine();

				for (int j = 0; j < 8; j++) {

					map[i + 3][j + 3] = buffer.charAt(j) - '0';

				}

			}

			int y = sc.nextInt();

			int x = sc.nextInt();

			if (map[x + 2][y + 2] == 1) {

				map[x + 2][y + 2] = 0;

				exp(map, x + 2, y + 2);

			}

			System.out.println("Data " + c + ":");

			for (int i = 0; i < 8; i++) {

				for (int j = 0; j < 8; j++) {

					System.out.print(map[i + 3][j + 3]);

				}

				System.out.println();

			}

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}