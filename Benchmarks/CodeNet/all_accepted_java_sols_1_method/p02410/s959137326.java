import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// n×mの行列Aのnとmの数、m×1の列ベクトルbのmの数を取得
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		// aの2次元配列とbの1次元配列、答えを入れるcの一次元配列をつくる
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];

		// 配列に入力値を入れる
		for (int cnt = 0; cnt < n; cnt++) {
			for (int i = 0; i < m; i++) {
				a[cnt][i] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		// ansを計算してcの一次元配列に入れる
		int ans = 0;
		for (int cnt = 0; cnt < n; cnt++) {
			for (int i = 0; i < m; i++) {
				ans = ans + a[cnt][i] * b[i];
			}
			c[cnt] = ans;
			ans = 0;
		}

		// 答えcを表示
		for (int cnt = 0; cnt < n; cnt++) {
			System.out.println(c[cnt]);
		}
	}
}

