import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int C = in.nextInt();
		int[] B = new int[M];
		for (int i = 0; i < M; ++i) {
			B[i] = in.nextInt();
		}
		int[][] A = new int[N][M];
		for (int h = 0; h < N; ++h) {
			for (int w = 0; w < M; ++w) {
				A[h][w] = in.nextInt();
			}
		}
		in.close();
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if (isValid(A[i], B, C)) {
				++count;
			}
		}
		System.out.println(count);
	}

	static boolean isValid(int[] A, int[] B, int C) {
		int result = C;
		for (int i = 0; i < A.length; ++i) {
			result += A[i] * B[i];
		}
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

}
