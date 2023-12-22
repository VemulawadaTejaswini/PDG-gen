

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();

		int[] P = new int[N];
		double[] e = new double[N];

		for (int i = 0; i < N; i++) {
			P[i] = scan.nextInt();
			e[i] = (double) (P[i] + 1) / 2;
		}

		double expect = 0;

		for (int i = 0; i < K; i++) {
			expect += e[i];
		}

		double max = expect;

		int left = 0;
		int right = K;

		for (int i = 0; i < N - K; i++) {
			expect = expect - e[left] + e[right];
			if (max < expect) {
				max = expect;
			}
			left++;
			right++;
		}

		System.out.println(max);
	}

}
