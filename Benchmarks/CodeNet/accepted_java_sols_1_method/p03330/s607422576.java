import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[c][c];
		int[][] b = new int[n][n];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt() - 1;
			}
		}
		long[][] sum = new long[3][c];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					// 1つ目のグループをiに変えるのに必要なコスト
					if((j + k) % 3 == 0) {
						if(b[j][k] != i) sum[0][i] += a[b[j][k]][i];
					// 2つ目のグループをiに変えるのに必要なコスト
					} else if((j + k) % 3 == 1) {
						if(b[j][k] != i) sum[1][i] += a[b[j][k]][i];
					// 3つ目のグループをiに変えるのに必要なコスト
					} else {
						if(b[j][k] != i) sum[2][i] += a[b[j][k]][i];
					}
				}
			}
		}
		long ans = Long.MAX_VALUE;
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = 0; k < c; k++) {
					if(i == j || j == k || k == i) continue;
					long totalCost = sum[0][i] + sum[1][j] + sum[2][k];
					ans = Math.min(ans, totalCost);
 				}
			}
		}
		System.out.println(ans);
	}
}
