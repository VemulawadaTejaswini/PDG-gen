import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Bydo {
		String name;
		int cost, vocal, dance, looks;

		public Bydo(String name, int cost, int vocal, int dance, int looks) {
			super();
			this.name = name;
			this.cost = cost;
			this.vocal = vocal;
			this.dance = dance;
			this.looks = looks;
		}

		public Bydo(Bydo b) {
			this.name = b.name;
			this.cost = b.cost;
			this.vocal = b.vocal;
			this.dance = b.dance;
			this.looks = b.looks;
		}
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			final int N = sc.nextInt();
			final int M = sc.nextInt();

			Bydo[] in = new Bydo[N];
			for (int i = 0; i < N; i++) {
				sc.nextLine();
				in[i] = new Bydo(sc.nextLine(), sc.nextInt(), sc.nextInt(),
						sc.nextInt(), sc.nextInt());
			}

			int[] vocal_DP = new int[M + 1];
			int[] dance_DP = new int[M + 1];
			int[] looks_DP = new int[M + 1];

			for (int i = 1; i < (M + 1); i++) {
				vocal_DP[i] = -1;
				dance_DP[i] = -1;
				looks_DP[i] = -1;
			}

			vocal_DP[0] = 0;
			dance_DP[0] = 0;
			looks_DP[0] = 0;

			for (Bydo bydo : in) {
				for (int i = M; i >= 0; i--) {
					if (vocal_DP[i] != -1) {
						for (int j = 1; (j * bydo.cost + i) <= M; j++) {
							if (vocal_DP[j * bydo.cost + i] == -1
									|| vocal_DP[j * bydo.cost + i] < vocal_DP[i]
											+ j * bydo.vocal) {
								vocal_DP[j * bydo.cost + i] = vocal_DP[i] + j
										* bydo.vocal;
							}
						}
					}

					if (dance_DP[i] != -1) {
						for (int j = 1; (j * bydo.cost + i) <= M; j++) {
							if (dance_DP[j * bydo.cost + i] == -1
									|| dance_DP[j * bydo.cost + i] < dance_DP[i]
											+ j * bydo.dance) {
								dance_DP[j * bydo.cost + i] = dance_DP[i] + j
										* bydo.dance;
							}
						}
					}

					if (looks_DP[i] != -1) {
						for (int j = 1; (j * bydo.cost + i) <= M; j++) {
							if (looks_DP[j * bydo.cost + i] == -1
									|| looks_DP[j * bydo.cost + i] < looks_DP[i]
											+ j * bydo.looks) {
								looks_DP[j * bydo.cost + i] = looks_DP[i] + j
										* bydo.looks;
							}
						}
					}
				}
			}
			/*
			System.out.println(Arrays.toString(vocal_DP));
			System.out.println(Arrays.toString(dance_DP));
			System.out.println(Arrays.toString(looks_DP));
			*/
			int max = 0;
			for (int i = M; i >= 0; i--) {
				max = Math.max(max, vocal_DP[i]);
				max = Math.max(max, dance_DP[i]);
				max = Math.max(max, looks_DP[i]);
			}

			System.out.println(max);

		}
	}

}