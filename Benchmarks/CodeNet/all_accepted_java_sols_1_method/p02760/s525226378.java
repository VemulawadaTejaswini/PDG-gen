
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int i2 = 0; i2 < 3; i2++){
				bingo[i][i2] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		boolean[][] bingo2 = new boolean[3][3];
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			for(int k = 0; k < 3; k++){
				for(int k2 = 0; k2 < 3; k2++){
					if(bingo[k][k2] == x){
						bingo2[k][k2] = true;
					}
				}
			}
		}
		boolean isBingo =
				bingo2[0][0] && bingo2[0][1] && bingo2[0][2]
				|| bingo2[1][0] && bingo2[1][1] && bingo2[1][2]
						|| bingo2[2][0] && bingo2[2][1] && bingo2[2][2]
				|| bingo2[0][0] && bingo2[1][1] && bingo2[2][2]
						|| bingo2[0][0] && bingo2[1][0] && bingo2[2][0]
						|| bingo2[0][1] && bingo2[1][1] && bingo2[2][1]
						|| bingo2[0][2] && bingo2[1][2] && bingo2[2][2]
						|| bingo2[0][2] && bingo2[1][1] && bingo2[2][0];
		System.out.println(isBingo ? "Yes" : "No");
	}
}
