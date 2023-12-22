import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[][] A = new int[n][m];
		int[] ans = new int[n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				A[i][j] = stdIn.nextInt();
			}
		}
		for (int i=0; i<m; i++) {
			int b = stdIn.nextInt();
			for (int j=0; j<n; j++) {
				ans[j] += A[j][i]*b;
			}
		}
		for (int ret : ans) {
			System.out.println(ret);
		}
	}
}