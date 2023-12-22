import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int W = scn.nextInt();
		int N = 0;
		int[][] coin = new int[H + 1][W + 1];
		int[][] ncoin = new int[H + 1][W + 1];
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				int a = scn.nextInt();
				coin[i][j] = a;
				ncoin[i][j] = a;
			}
		}
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				int c = coin[i][j];
				if (c % 2 != 0) {
					if (j == W) {
						if (i == H) {
							break;
						} else {
							N++;
							coin[i + 1][j]++;
						}
					} else {
						N++;
						coin[i][j+1]++;
					}
				}
			}
		}
		System.out.println(N);
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				int c = ncoin[i][j];
				if (c % 2 != 0) {
					if (j == W) {
						if (i == H) {
							break;
						} else {
							System.out.println(i + " " + j + " " + (i+1) + " " + (j));
							ncoin[i + 1][j]++;
						}
					} else {
						System.out.println(i + " " + j + " " + (i) + " " + (j+1));
						ncoin[i][j+1]++;
					}
				}
			}
		}
		scn.close();
	}
}
