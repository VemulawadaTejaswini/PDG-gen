import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] array = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				array[i][j] = scan.nextInt();
				array[i][c] += array[i][j];
				array[r][j] += array[i][j];
				array[r][c] += array[i][j];
			}
		}
		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(array[i][j]);
				if (j != c) {
					System.out.print(" ");
				} else {
					System.out.println();
				}
			}
		}
	}

}