import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] bingo = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (bingo[j][k] == b) {
						bingo[j][k] = 0;
					}
				}
			}
		}

		boolean flg = false;
		flg |= bingo[0][0] == 0 && bingo[1][0] == 0 && bingo[2][0] == 0;
		flg |= bingo[0][1] == 0 && bingo[1][1] == 0 && bingo[2][1] == 0;
		flg |= bingo[0][2] == 0 && bingo[1][2] == 0 && bingo[2][2] == 0;
		flg |= bingo[0][0] == 0 && bingo[0][1] == 0 && bingo[0][2] == 0;
		flg |= bingo[1][0] == 0 && bingo[1][1] == 0 && bingo[1][2] == 0;
		flg |= bingo[2][0] == 0 && bingo[2][1] == 0 && bingo[2][2] == 0;
		flg |= bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0;
		flg |= bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0;
		System.out.println(flg ? "Yes" : "No");
	}

}