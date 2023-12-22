
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] A = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = in.nextInt();
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j <= i; j++) {
				sum += A[0][j];
			}
			for (int j = i; j < N; j++) {
				sum += A[1][j];
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
		in.close();
	}
}