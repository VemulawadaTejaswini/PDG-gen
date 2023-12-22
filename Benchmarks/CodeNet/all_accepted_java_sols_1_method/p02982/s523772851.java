import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int d = in.nextInt();

		int[][] x = new int[n][d];
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < d; j++ ) {
				x[i][j] = in.nextInt();
				// System.out.println(x[i][j]);
			}
		}

		int cnt = 0;
		// i行目とj行目の比較
		for ( int i = 0; i < n; i++ ) {
			for ( int j = i + 1; j < n; j++ ) {

				int sanonijou = 0;
				for ( int k = 0; k < d; k++ ) {
					sanonijou += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
				}
				double rt = Math.sqrt(sanonijou);
				
				if(rt - (int)rt == 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		in.close();
	}
}