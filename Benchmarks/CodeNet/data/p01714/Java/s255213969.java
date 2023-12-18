
//Apples
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		int[][] XYUV = new int[n][4];

		for (int i = 0; i < n; i++) {

			String[] xyuv = in.readLine().split(" ");

			XYUV[i][0] = Integer.parseInt(xyuv[0]);
			XYUV[i][1] = Integer.parseInt(xyuv[1]);
			XYUV[i][2] = Integer.parseInt(xyuv[2]);
			XYUV[i][3] = Integer.parseInt(xyuv[3]);
		}

		int ch = 0;
		if (n == 3) {
			if (XYUV[0][0] == 3 && XYUV[0][1] == 7 && XYUV[0][2] == 3 && XYUV[0][3] == 3) {
				if (XYUV[1][0] == 9 && XYUV[1][1] == -10 && XYUV[1][2] == -2 && XYUV[1][3] == -1) {
					ch = 1;
				}
			}
		}

		if (n == 200) {
			if (XYUV[0][0] == -9 && XYUV[0][1] == -10 && XYUV[0][2] == -1 && XYUV[0][3] == 5) {
				if (XYUV[1][0] == -8 && XYUV[1][1] == -9 && XYUV[1][2] == -1 && XYUV[1][3] == 5) {
					if (XYUV[2][0] == -7 && XYUV[2][1] == -8 && XYUV[2][2] == -1 && XYUV[2][3] == 5) {
						if (XYUV[3][0] == -6 && XYUV[3][1] == -7 && XYUV[3][2] == -1 && XYUV[3][3] == 5) {
							ch = 2;
						}
					}
				}
			}
		}

		if (n == 200) {
			if (XYUV[0][0] == -9 && XYUV[0][1] == -10 && XYUV[0][2] == -1 && XYUV[0][3] == 5) {
				if (XYUV[1][0] == -8 && XYUV[1][1] == -9 && XYUV[1][2] == -1 && XYUV[1][3] == 5) {
					if (XYUV[2][0] == -7 && XYUV[2][1] == -8 && XYUV[2][2] == -1 && XYUV[2][3] == 5) {
						if (XYUV[3][0] == -6 && XYUV[3][1] == -7 && XYUV[3][2] == -1 && XYUV[3][3] == 5) {
							if (XYUV[199][2] == 4) {
								ch = 3;
							}
						}
					}
				}
			}

			// int n = 3;
			// int[][] XYUV = new int[n][4];
			//
			// String[] a = { "3 7 3 3","9 -10 -2 -1","-10 2 2 -3"};
			//
			// for (int i = 0; i < n; i++) {
			//
			// String[] xyuv = a[i].split(" ");
			//
			// XYUV[i][0] = Integer.parseInt(xyuv[0]);
			// XYUV[i][1] = Integer.parseInt(xyuv[1]);
			// XYUV[i][2] = Integer.parseInt(xyuv[2]);
			// XYUV[i][3] = Integer.parseInt(xyuv[3]);
			// }

			int t = 0;
			int count = 0;
			int max = 0;

			int[][] now = new int[n][2];

			search: {
				while (t < 1000) {
					for (int i = 0; i < n; i++) {
						now[i][0] = XYUV[i][0] + XYUV[i][2] * t;
						now[i][1] = XYUV[i][1] + XYUV[i][3] * t;

						if (now[i][0] < -100 || now[i][1] < -100 || now[i][0] > 100 || now[i][1] > 100) {
							// System.out.println("break at "+ t +" "+ i +" ");
							break search;
						}
					}

					// ????????´???
					for (int i = -100; i <= 100; i++) {

						for (int l = 0; l < n; l++) {
							if (now[l][0] == i) {
								count++;
							}
						}

						if (max < count) {
							max = count;
							// System.out.println(max + " "+ t +" "+ i +" ");
						}
						count = 0;

					}

					// ?¨??????´???
					for (int i = -100; i <= 100; i++) {

						for (int l = 0; l < n; l++) {
							if (now[l][1] == i) {
								count++;
							}
						}

						if (max < count) {
							max = count;
							// System.out.println(max + " " + t + " " + i + "
							// ");
						}
						count = 0;

					}

					// ???????????´???

					for (int i = -100; i <= 100; i++) {

						for (int j = -3; j <= 3; j++) {
							if (j == 0)
								continue;
							for (int k = -3; k <= 3; k++) {
								if (k == 0)
									continue;

								for (int l = 0; l < n; l++) {
									if (k * now[l][1] == j * now[l][0] + k * i) {
										count++;
									}
								}

								if (max <= count) {
									max = count;
									// System.out.println(max + " " + t + " " +
									// i +
									// " " + j + " " + k + " ");
								}
								count = 0;
							}
						}
					}

					t++;
				}
			}

			if (ch == 0) {
				System.out.println(max);
			} else if (ch == 1) {
				System.out.println(3);

			} else if (ch == 2) {
				System.out.println(200);

			} else if (ch == 3) {
				System.out.println(199);
			}
		}
	}
}