import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int rm = r + 1;
		int cm = c + 1;
		int[][] sheet = new int[rm][cm];
		for (int i = 0; i < r; ++i) {
			for(int j = 0; j < c; ++j) {
				sheet[i][c] += sheet[i][j] = s.nextInt();
				sheet[r][j] += sheet[i][j];
				sheet[r][c] += sheet[i][j];
			}
		}
		for(int i = 0; i < rm; ++i) {
			for (int j = 0; j < cm; ++j) {
				System.out.print(((j != 0)?" ":"") + sheet[i][j]);
			}
			System.out.println();
		}
	}
}