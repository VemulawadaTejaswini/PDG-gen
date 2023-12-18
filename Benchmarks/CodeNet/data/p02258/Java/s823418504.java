
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numItems = in.nextInt();

		int[] currencies = new int[numItems];
		for (int i = 0; i < numItems; i++) {
			currencies[i] = in.nextInt();
		}

		System.out.println(maxProfitDP(numItems, currencies));
	}

	public static int maxProfit(int n, int[] R) {
		int max_profit = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (R[j] - R[i] > max_profit)
					max_profit = R[j] - R[i];
			}
		}
		return max_profit;
	}

	public static int maxProfitDP(int n, int[] R) {
		int[] profits = new int[n];
		profits[0] = Integer.MIN_VALUE;
		int minVal = R[0];

		for (int i = 1; i < n; i++) {
			profits[i] = Math.max(profits[i - 1], R[i] - minVal);
			minVal = Math.min(minVal, R[i]);
		}

		return profits[n - 1];
	}
}
