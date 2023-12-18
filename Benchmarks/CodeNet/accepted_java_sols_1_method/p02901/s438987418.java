import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long INF = 100000000000L;

		int N = scn.nextInt(), M = scn.nextInt();
		int NN = (int) Math.pow(2, N);

		long[] DP = new long[NN];
		long[] cost = new long[M];
		int[] keys = new int[M];

		Arrays.fill(DP,INF);
		DP[0] = 0;

		for (int i = 0; i < M; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();

			cost[i] = a;
			int key = 0;
			for (int j = 0; j < b; j++) {
				int c = scn.nextInt() - 1;
				key += Math.pow(2, c);
			}
			keys[i] = key;
		}
		for (int i = 0; i < M; i++) {
			long c = cost[i];
			int box = keys[i];
			for (int j = 0; j < NN; j++) {
				int tob = j - (j&box);
				DP[j] = Math.min(DP[j], DP[tob] + c);
			}
		}

		System.out.println((DP[NN-1] > INF-1)?-1:DP[NN-1]);
	}

}
