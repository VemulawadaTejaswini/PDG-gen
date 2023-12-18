import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gyoretu = new int[n][m];
		int[] beku = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gyoretu[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			int b = scanner.nextInt();
			for (int j=0; j<n; j++) {
				beku[j] += gyoretu[j][i]*b;
			}
		}
		for (int C : beku) {
			System.out.println(C);
		}
	}
}

