
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[3][3];
		boolean[][] bingo = new boolean[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		for(int k = 0; k < n; k++) {
			int b = sc.nextInt();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(b == num[i][j]) {
						bingo[i][j] = true;
					}
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < 3; i++) {
			boolean w = true;
			boolean h = true;
			for(int j = 0; j < 3; j++) {
				w = w && bingo[i][j];
				h = h && bingo[j][i];
			}
			if(w)
				ans++;
			if(h)
				ans++;
		}
		if(bingo[0][0] && bingo[1][1] && bingo[2][2])
			ans++;
		if(bingo[0][2] && bingo[1][1] && bingo[2][0])
			ans++;
		System.out.println(ans > 0 ? "Yes" : "No");

	}

}
