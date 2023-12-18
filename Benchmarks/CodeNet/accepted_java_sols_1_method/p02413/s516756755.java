import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int r, c, i, j;
		try (Scanner sc = new Scanner(System.in)) {
			r = sc.nextInt();
			c = sc.nextInt();
			int pict[][] = new int[r + 1][c + 1]; //表の配列
			for(i = 0; i < r; i++) {
				for(j = 0; j < c; j++) {
					pict[i][j] = sc.nextInt();
					pict[r][j] += pict[i][j];
					pict[i][c] += pict[i][j];
					pict[r][c] += pict[i][j];
				}
			}
			for(i = 0; i < r + 1; i++) {
				for(j = 0; j < c + 1; j++) {
					System.out.print(pict[i][j]);
					if(j < c){
					    System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}

