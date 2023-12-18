import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] hyou = new int[r + 1][c + 1];
		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				hyou[i][j] = scanner.nextInt();
				hyou[r][j] += hyou[i][j];
				hyou[i][c] += hyou[i][j];
				hyou[r][c] += hyou[i][j];
			}
		}
		for (int i = 0; i <= r; ++i) {
			for (int j = 0; j <= c; ++j) {
				if (j != 0){
				    System.out.print(' ');
				} 
				System.out.print(hyou[i][j]);
			}
			System.out.println();
		}
	}
}
