import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oki = 0;
		int judge = 0;
		int dice = scanner.nextInt();
		int[] dice1 = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt() };
		for (int d = 0; d < dice - 1; d++) {
			int[] dice2 = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt() };

			if (dice1[0] == dice2[0]) {

				if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4]
						&& dice1[5] == dice2[5]) {
					judge = judge + 1;

				} else {

					for (int j = 0; j < 4; j++) {
						oki = dice1[0];
						dice1[0] = dice1[3];
						dice1[3] = dice1[5];
						dice1[5] = dice1[2];
						dice1[2] = oki;
						if (dice1[0] == dice2[0]) {

							if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
									&& dice1[4] == dice2[4]
									&& dice1[5] == dice2[5]) {
								judge = judge + 1;

							}

							else {
								for (int i = 0; i < 4; i++) {
									oki = dice1[1];
									dice1[1] = dice1[3];
									dice1[3] = dice1[4];
									dice1[4] = dice1[2];
									dice1[2] = oki;
									if (dice1[0] == dice2[0]) {

										if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
												&& dice1[4] == dice2[4]
												&& dice1[5] == dice2[5]) {
											judge = judge + 1;
										}
									}
								}
							}
						}
					}
					for (int i = 0; i < 4; i++) {
						oki = dice1[0];
						dice1[0] = dice1[1];
						dice1[1] = dice1[5];
						dice1[5] = dice1[4];
						dice1[4] = oki;
						if (dice1[0] == dice2[0]) {

							if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
									&& dice1[4] == dice2[4]
									&& dice1[5] == dice2[5]) {
								judge = judge + 1;

							} else {
								for (int k = 0; k < 4; k++) {
									oki = dice1[1];
									dice1[1] = dice1[3];
									dice1[3] = dice1[4];
									dice1[4] = dice1[2];
									dice1[2] = oki;
									if (dice1[0] == dice2[0]) {

										if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
												&& dice1[4] == dice2[4]
												&& dice1[5] == dice2[5]) {
											judge = judge + 1;
										}
									}
								}
							}
						}
					}

				}
			}

			else {

				for (int k = 0; k < 4; k++) {
					oki = dice1[0];
					dice1[0] = dice1[1];
					dice1[1] = dice1[5];
					dice1[5] = dice1[4];
					dice1[4] = oki;
					if (dice1[0] == dice2[0]) {

						if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
								&& dice1[4] == dice2[4]
								&& dice1[5] == dice2[5]) {
							judge = judge + 1;
						} else {
							for (int i = 0; i < 4; i++) {
								oki = dice1[1];
								dice1[1] = dice1[3];
								dice1[3] = dice1[4];
								dice1[4] = dice1[2];
								dice1[2] = oki;
								if (dice1[0] == dice2[0]) {

									if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
											&& dice1[4] == dice2[4]
											&& dice1[5] == dice2[5]) {
										judge = judge + 1;
									}
								}
							}
						}
					}
				}
				for (int j = 0; j < 4; j++) {
					oki = dice1[0];
					dice1[0] = dice1[3];
					dice1[3] = dice1[5];
					dice1[5] = dice1[2];
					dice1[2] = oki;
					if (dice1[0] == dice2[0]) {

						if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4]
								&& dice1[5] == dice2[5]) {
							judge = judge + 1;

						} else {
							for (int i = 0; i < 4; i++) {
								oki = dice1[1];
								dice1[1] = dice1[3];
								dice1[3] = dice1[4];
								dice1[4] = dice1[2];
								dice1[2] = oki;
								if (dice1[0] == dice2[0]) {

									if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3]
											&& dice1[4] == dice2[4]
											&& dice1[5] == dice2[5]) {
										judge = judge + 1;
									}
								}
							}
						}
					}
				}
			}

		}
		if (judge >= 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
