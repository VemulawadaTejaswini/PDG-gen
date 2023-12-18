import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				a[i][k] = scan.nextInt();
			}
		}
		for (int j = 0; j < m; j++)	{
			b[j] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i] += a[i][j] * b[j];
			}
		}
		for (int h = 0; h < n; h++) {
			System.out.println(c[h]);
		}
	}
}
