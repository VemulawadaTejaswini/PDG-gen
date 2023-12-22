import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int m = Integer.parseInt(in.next());
		int[][] a = new int[n][m];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(in.next());
			}
		}
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(in.next());
		}
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i] += a[i][j] * b[j];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
	}
}	
