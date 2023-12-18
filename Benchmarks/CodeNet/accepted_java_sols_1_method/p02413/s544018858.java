import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int r = scan.nextInt();
	int c = scan.nextInt();
	int[][] sheet = new int[r+1][c+1];
	for (int i = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		sheet[i][j] = scan.nextInt();
	    }
	}
	for (int i = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		sheet[i][c] += sheet[i][j];
		sheet[r][j] += sheet[i][j];
	    }
	}
	for (int i = 0; i < c; i++) {
	    sheet[r][c] += sheet[r][i];
	}
	for (int i = 0; i < r + 1; i++) {
	    System.out.print(sheet[i][0]);
	    for (int j = 1; j < c + 1; j++) {
		System.out.print(" " + sheet[i][j]);
	    }
	    System.out.println();
	}
    }
}