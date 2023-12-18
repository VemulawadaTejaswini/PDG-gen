import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] S = new int[N];
		int[] T = new int[N];
		for (int i = 0; i < N; ++i) {
			S[i] = Integer.parseInt(sc.next());
			T[i] = Integer.parseInt(sc.next());
		}
		int[] P = new int[M + 2];
		for (int i = 0; i < M; ++i) {
			P[i + 1] = Integer.parseInt(sc.next());
		}
		P[M + 1] = 1000000001;
		Arrays.sort(P);
		int[][] tbl = new int[M + 2][2];
		for (int i = 1; i <= M + 1; ++i) {
			tbl[i][1 - i % 2] = tbl[i - 1][1 - i % 2] + P[i] - P[i - 1];
			tbl[i][i % 2] = tbl[i - 1][i % 2];
		}
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			int[] len = new int[2];
			int posFar = -Arrays.binarySearch(P, Math.max(S[i], T[i])) - 2;
			len[0] = tbl[posFar][0];
			len[1] = tbl[posFar][1];
			int posNear = -Arrays.binarySearch(P, Math.min(S[i], T[i])) - 2;
			len[0] -= tbl[posNear][0];
			len[1] -= tbl[posNear][1];
			int add = 0;
			if (S[i] < T[i]) {
				add = len[posNear % 2];
				add -= S[i] - P[posNear];
				if (posFar % 2 == posNear % 2) add += T[i] - P[posFar];
			} else {
				add = len[posFar % 2];
				add += S[i] - P[posFar];
				if (posFar % 2 == posNear % 2) add -= T[i] - P[posNear];
			}
			sum += add;
		}
		System.out.println(sum);
	}
}