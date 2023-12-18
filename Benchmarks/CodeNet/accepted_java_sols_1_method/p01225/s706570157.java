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
			//??????1
			if (RCount % 3 == 0 && GCount % 3 == 0) {
				//?????????????????????????????????
				for (int i = 0; i < 8; i++) {
					for (int j = i+1; j < 9; j++) {
						if (num[i] > num[j]) {
							int numTaihi = num[i];
							num[i] = num[j];
							num[j] = numTaihi;
							int colorTaihi = color[i];
							color[i] = color[j];
							color[j] = colorTaihi;
						}
					}
				}
				//????????????????????????????????????
				for (int xMaime = 0; xMaime < 7; xMaime++) {
					if (used[xMaime] == 0) {
						for (int yMaime = xMaime + 1; yMaime < 8; yMaime++) {
							if (used[xMaime] == 1) {
								break;
							}
							if(used[yMaime] == 0) {
								for (int zMaime = yMaime + 1; zMaime < 9; zMaime++) {
									if (used[xMaime] == 1) {
										break;
									}
									if (used[zMaime] == 0) {
										if (color[xMaime] == color[yMaime] && color[xMaime] == color[zMaime]) {
											if (num[xMaime] == num[yMaime] && num[xMaime] == num[zMaime]) {
												trueSet++;
												used[xMaime]++;
												used[yMaime]++;
												used[zMaime]++;
											} else if (num[xMaime]+1 == num[yMaime] && num[yMaime]+1 == num[zMaime]) {
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
				//??????
				if (trueSet == 3) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else {
				System.out.println(0);
			}
		}
	}
}