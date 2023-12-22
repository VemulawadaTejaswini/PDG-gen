import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt(); int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<m; i++) b[i] = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int ans = 0;
			for (int j=0; j<m; j++) {
				ans += a[i][j] * b[j];
			}
			System.out.println(ans);
		}
	}
}
