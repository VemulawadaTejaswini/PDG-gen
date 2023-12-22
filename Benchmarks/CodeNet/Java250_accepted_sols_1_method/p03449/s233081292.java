import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			for (int j = 0; j <= i; j++) {
				cnt += A[0][j];
			}
			cnt += A[1][i];
			for (int j = i+1; j < N; j++) {
				cnt += A[1][j];
			}
			if (cnt > max) {
				max = cnt;
			}
		}
		System.out.println(max);
	}
}
