
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] train = new int[n + 1][n + 1];
		for(int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			train[l][r]++;
		}
		int[][] sum = new int[n + 1][n + 1];
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				sum[i][j] = train[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
			}
		}
		for(int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = sum[r][r] - sum[l - 1][r] - sum[r][l - 1] + sum[l - 1][l - 1];
			System.out.println(ans);
		}

	}

}