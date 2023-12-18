import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int K;
	static int[] A;
	static int[] B;
	static int[][] MAX;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		A = new int[N];
		B = new int[M];
		MAX = new int[N + 1][M + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				MAX[i][j] = -1;
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			A[i] = sc.nextInt();
		}
		for (int i = M - 1; i >= 0; i--) {
			B[i] = sc.nextInt();
		}

		int result = maxCnt(N, M, K);

		System.out.println(result);
	}

	static int maxCnt(int resA, int resB, int resK) {
		if (MAX[resA][resB] >= 0)
			return MAX[resA][resB];
		if (resA == 0 && resB == 0) {
			return MAX[resA][resB] = 0;
		} else if (resA == 0) {
			if (B[resB - 1] > resK) {
				return MAX[resA][resB] = 0;
			} else {
				return MAX[resA][resB] = maxCnt(resA, resB - 1, resK - B[resB - 1]) + 1;
			}
		} else if (resB == 0) {
			if (A[resA - 1] > resK) {
				return MAX[resA][resB] = 0;
			} else {
				return MAX[resA][resB] = maxCnt(resA - 1, resB, resK - A[resA - 1]) + 1;
			}
		} else {
			if (A[resA - 1] > resK && B[resB - 1] > resK) {
				return MAX[resA][resB] = 0;
			} else if (A[resA - 1] > resK) {
				return MAX[resA][resB] = maxCnt(resA, resB - 1, resK - B[resB - 1]) + 1;
			} else if (B[resB - 1] > resK) {
				return MAX[resA][resB] = maxCnt(resA - 1, resB, resK - A[resA - 1]) + 1;
			} else {
				return MAX[resA][resB] = Math.max(maxCnt(resA, resB - 1, resK - B[resB - 1]),
						maxCnt(resA - 1, resB, resK - A[resA - 1])) + 1;
			}
		}
	}
}
