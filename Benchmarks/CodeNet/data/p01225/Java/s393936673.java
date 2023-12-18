import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//????????????????????°?????\???
		int set = sc.nextInt();
		int[] num = new int[9];
		int[] color = new int[9];
		for (int setCount = 0; setCount < set; setCount++) {
			int RCount = 0;
			int GCount = 0;
			int[] used = new int[9];
			int trueSet = 0;
			//??\???
			for (int count = 0; count < 9; count++ ) {
				num[count] = sc.nextInt();
			}
			for (int count = 0; count < 9; count++) {
				String cl = sc.next();
				if (cl.equals("R") ) {
					color[count] = 0;
					RCount++;
				} else if (cl.equals("G") ) {
					color[count] = 1;
					GCount++;
				} else {
					color[count] = 2;
				}
			}
			//??????
			if ((RCount == 0 && GCount == 0) || (RCount == 0 && GCount == 3) ||
				(RCount == 0 && GCount == 6) || (RCount == 3 && GCount == 0) ||
				(RCount == 3 && GCount == 3) || (RCount == 3 && GCount == 6) ||
				(RCount == 6 && GCount == 0) || (RCount == 6 && GCount == 3) ||
				(RCount == 9) || (GCount == 9)) {
				for (int xMaime = 0; xMaime < 7; xMaime++) {
					if (used[xMaime] == 0) {
						for (int yMaime = xMaime + 1; yMaime < 8; yMaime++) {
							if(used[yMaime] == 0) {
								for (int zMaime = yMaime + 1; zMaime < 9; zMaime++) {
									if (used[zMaime] == 0) {
										if (color[xMaime] == color[yMaime] && color[xMaime] == color[zMaime]) {
											if (num[xMaime] == num[yMaime] && num[xMaime] == num[zMaime]) {
												trueSet++;
												used[xMaime]++;
												used[yMaime]++;
												used[zMaime]++;
											} else {
												int[] renban = new int[3];
												if (num[xMaime] <= num[yMaime] && num[xMaime] <= num[zMaime]) {
													renban[0] = num[xMaime];
													if (num[yMaime] <= num[zMaime]) {
														renban[1] = num[yMaime];
														renban[2] = num[zMaime];
													} else {
														renban[1] = num[zMaime];
														renban[2] = num[yMaime];
													}
												} else if (num[yMaime] <= num[xMaime] && num[yMaime] <= num[zMaime]) {
													renban[0] = num[yMaime];
													if (num[xMaime] <= num[zMaime]) {
														renban[1] = num[xMaime];
														renban[2] = num[zMaime];
													} else {
														renban[1] = num[zMaime];
														renban[2] = num[xMaime];
													}
												} else {
													renban[0] = num[zMaime];
													if (num[xMaime] <= num[yMaime]) {
														renban[1] = num[xMaime];
														renban[2] = num[yMaime];
													} else {
														renban[1] = num[yMaime];
														renban[2] = num[xMaime];
													}
												}
												if (renban[0]+1 == renban[1] && renban[1]+1 == renban[2]) {
													trueSet++;
													used[xMaime]++;
													used[yMaime]++;
													used[zMaime]++;
												}
											}
										}
									}
								}
							}
						}
					}
					if (trueSet == 3) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				}
			} else {
				System.out.println(0);
			}
		}
	}
}