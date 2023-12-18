import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][]A = new int[n][m];
		int[]b = new int[m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			b[i] = scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < n; i++) {
			int t = 0;
			for(int j = 0; j < m ; j++) {
				t += A[i][j] * b[j];
			}
			System.out.println(t);
		}
		scan.close();
	}
}
