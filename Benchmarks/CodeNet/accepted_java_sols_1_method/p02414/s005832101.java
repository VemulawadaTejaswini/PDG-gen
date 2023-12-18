import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// n×mの行列Aのnとmの数、m×lの列ベクトルbのmとlの数を取得
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		// aの二次元配列とbの二次元配列、答えを入れるcの一次元配列をつくる
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		long[][] c = new long[n][l];

		// aの二次元配列に入力値を入れる
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// bの二次元配列に入力値を入れる
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		// ansを計算してcの二次元配列に入れる
		long ans = 0;
		int i;
		int j;
		int k;
		for (i = 0; i < n; i++) {
			for (j = 0; j < l; j++) {
				for (k = 0; k < m; k++) {
					ans = ans + a[i][k] * b[k][j];
				}
				c[i][j] = ans;
				ans = 0;
			}
		}

		// 答えcの二次元配列を表示
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < l; column++) {
				System.out.print(c[row][column]);
				if (!(column == l - 1)) {
					System.out.print(" ");
				}
				if (column == l - 1) {
					System.out.println("");
				}
			}
		}
	}
}
