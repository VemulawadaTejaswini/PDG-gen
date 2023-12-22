import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int a[][] = new int[2][N];
		for (int i = 0; i < N; i++) {
			a[0][i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			a[1][i] = sc.nextInt();
		}
		int x = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			x = 0;
			for (int j = 0; j < N; j++) {
				if (j < i) {
					x += a[0][j];
				} else if (j == i) {
					x += a[0][j];
					x += a[1][j];
				} else {
					x += a[1][j];
				}
			}
			if (ans < x) {
				ans = x;
			}
		}

		// 出力
		System.out.println(ans);
	}
}
