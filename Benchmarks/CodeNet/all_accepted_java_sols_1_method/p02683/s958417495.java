import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		byte N = sc.nextByte();
		byte M = sc.nextByte();
		int X = sc.nextInt();
		int[] C = new int[N];
		int[][] A = new int[N][M];
		int[] cost = new int[(short) Math.pow(2, N)];
		int[][] reach = new int[(short) Math.pow(2, N)][M];
		//boolean ans = true;
		int a = -1;
		for (byte i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			for (byte j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for (short i = 0; i < (short) Math.pow(2, N); i++) {
			for (byte j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) {
					cost[i] += C[j];
					for (byte k = 0; k < M; k++) {
						reach[i][k] += A[j][k];
					}
				}
			}
			for (byte j = 0; j < M; j++) {
				if (reach[i][j] < X) {
					cost[i] = -1;
					break;
				}
			}
		}
		for (short i = 0; i < (short) Math.pow(2, N); i++) {
			if (cost[i] != -1) {
				if (a == -1) {
					a = cost[i];
				} else {
					a = Math.min(a, cost[i]);
				}
			}
		}
		System.out.println(a);
	}
}