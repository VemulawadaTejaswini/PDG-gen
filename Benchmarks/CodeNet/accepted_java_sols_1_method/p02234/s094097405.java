import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]p = new int[n + 1];
		int[][]m = new int[n + 1][n + 1];
		for(int i = 0; i < n; i++) {
			int r = scan.nextInt();
			int c = scan.nextInt();
			p[i] = r;
			p[i + 1] = c;
		}
		scan.close();
		for(int l = 2; l <= n; l++) {
			for(int i = 1; i <= n - l + 1; i++) {
				int j = i + l - 1;
				m[i][j] = (1 << 21);
				for(int k = i; k <= j - 1; k++) {
					m[i][j] = Math.min(m[i][j],
							+ m[i][k] + m[j][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]);
				}
			}
		}
		System.out.println(m[1][n]);
	}
}
