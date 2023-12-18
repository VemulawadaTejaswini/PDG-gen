import java.util.Scanner;

public class Main {

	// given n times, and R, an array of currencies/rates
	static int compute_maxprofit(int n, int[] R) {
		int max_profit = -999999999;
		int minprofit = R[0];

		for (int i = 1; i < n; i++) {
			max_profit = Math.max(max_profit, R[i] - minprofit);
			minprofit = Math.min(minprofit, R[i]);

		}
		return max_profit;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] R = new int[n];

		for (int i = 0; i < n; i++) {
			R[i] = in.nextInt();
		}
		System.out.println(compute_maxprofit(n, R));
		in.close();
	}
}
