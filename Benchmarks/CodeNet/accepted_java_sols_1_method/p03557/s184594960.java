import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long ans = 0;
		long[][] mat = new long[3][n];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scanner.nextInt();
			}
			Arrays.sort(mat[i]);
		}
		long[] r01 = new long[n];
		long[] r12 = new long[n];

		for (int i = n-1,j=n-1; i >= 0 && j>=0;) {
			if (mat[0][i] < mat[1][j]) {
				r01[j] = i + 1;
				j--;
			}else{
				i--;
			}
		}
		for (int i = 0,j=0; i < n && j < n;) {
			if (mat[1][i] < mat[2][j]) {
				r12[i] = n-j;
				i++;
			}else{
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			ans += r01[i] * r12[i];
		}
		System.out.println(ans);
	}
}