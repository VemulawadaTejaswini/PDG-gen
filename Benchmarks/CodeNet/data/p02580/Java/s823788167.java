import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean[][] tar = new boolean[h+1][n+1];
		for(boolean[] b : tar) Arrays.fill(b, false);
		for(int i = 0 ; i < m ; i++) {
			tar[scan.nextInt()][scan.nextInt()] = true;
		}
		scan.close();
		System.out.println(getValues(tar, h, n, m));
	}
	private static int getValues(boolean[][] tar, int h, int n, int m) {
		int[] rowCount = new int[h+1];
		int[] colCount = new int[n+1];
		for(int i = 1 ; i <= h ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				if(tar[i][j]) {
					rowCount[i]++;
					colCount[j]++;
				}
			}
		}
		int rowMax = rowCount[1];
		int rowIndex = 1;
		int colMax = colCount[1];
		int colIndex = 1;
		for(int i = 2 ; i <= h ; i++) {
			if(rowCount[i] > rowMax) {
				rowMax = rowCount[i];
				rowIndex = i;
			}
		}
		for(int i = 2 ; i <= n ; i++) {
			if(colCount[i] > colMax) {
				colMax = colCount[i];
				colIndex = i;
			}
		}
		return tar[rowIndex][colIndex] ? rowCount[rowIndex]+colCount[colIndex]-1 : rowCount[rowIndex]+colCount[colIndex];
	}
}
