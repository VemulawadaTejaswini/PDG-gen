import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][]A = new int[2][N];
		for(int i = 0; i < N; i++) {
			A[0][i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			A[1][i] = sc.nextInt();
		}
		sc.close();
		if(N == 1) {
			System.out.println(A[0][0] + A[1][0]);
			System.exit(0);
		}
		int[][]B = new int[2][N];
		B[0][0] = A[0][0];
		B[1][0] = A[1][0] + A[0][0];
		for(int i = 1; i < N; i++) {
			B[0][i] = B[0][i - 1] + A[0][i];
			B[1][i] = B[1][i - 1] + A[1][i];
		}
		for(int i = 1; i < N; i++) {
			B[1][i] = Math.max(B[1][i - 1], B[0][i]) + A[1][i];
		}
		System.out.println(B[1][N - 1]);
	}
}