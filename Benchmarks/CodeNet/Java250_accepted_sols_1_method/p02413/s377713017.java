import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//??\????????????
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] rc = new int[r+1][c+1];
		//?¨????
		for (int ri = 0; ri < r; ri++) {
			for (int ci = 0; ci < c; ci++) {
				rc[ri][ci] = sc.nextInt();
				rc[r][ci] += rc[ri][ci];
				rc[ri][c] += rc[ri][ci];
			}
			rc[r][c] += rc[ri][c];
		}
		//??????
		for (int ri = 0; ri <= r; ri++) {
			for (int ci = 0; ci <= c; ci++) {
				System.out.print(rc[ri][ci]);
				if (ci < c) {
					System.out.print(" ");
				} else {
					System.out.println("");
				}
			}
		}
	}

}