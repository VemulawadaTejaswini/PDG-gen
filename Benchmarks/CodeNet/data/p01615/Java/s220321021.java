import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		int[] C = new int[M];
		for (int i = 0; i < M; ++i) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		int[] d = new int[N];
		Arrays.fill(d, -1);
		d[0] = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				if (d[A[j]] == -1) continue;
				d[B[j]] = Math.max(d[B[j]], d[A[j]] + C[j]);
			}
		}
		System.out.println(d[N - 1]);
	}
}