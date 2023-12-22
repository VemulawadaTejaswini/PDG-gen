
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] candy = new long[2][n];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				candy[i][j] = sc.nextLong();
			}
		}
		long[][] sum = new long[2][n];
		sum[0][0] = candy[0][0];
		for(int i = 1; i < n; i++) {
			sum[0][i] = candy[0][i] + sum[0][i - 1];
		}
		sum[1][0] = sum[0][0] + candy[1][0];
		for(int i = 1; i < n; i++) {
			sum[1][i] = candy[1][i] + Math.max(sum[1][i - 1], sum[0][i]);
		}
		System.out.println(sum[1][n - 1]);

	}

}
