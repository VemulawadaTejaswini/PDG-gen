import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bmax = 4; int fmax = 3; int rmax = 10;
		int n = scan.nextInt();
		int b; int f; int r; int v;
		int[][][] build = new int[4][3][10]; // build[b][f][r]

		for (int i = 0; i < n; i++) {
			b = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			v = scan.nextInt();
			build[b-1][f-1][r-1] += v;
		}
		for (int i = 0; i < bmax; i++) {
			for (int j = 0; j < fmax; j++) {
				for (int k = 0; k < rmax; k++) {
					System.out.print(" " + build[i][j][k]);
				}
				System.out.println();
			}
			if (i != bmax - 1) System.out.println("####################");
		}
	}

}