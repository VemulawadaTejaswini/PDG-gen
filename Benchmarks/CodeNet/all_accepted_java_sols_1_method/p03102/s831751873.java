import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b_m = new int[m];
		int[][] a_nm = new int[n][m];
		for (int i = 0; i < m; i++) {
			b_m[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a_nm[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int ans = c;
			for (int j = 0; j < m; j++) {
				ans += a_nm[i][j] * b_m[j];
			}
			if (ans > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
