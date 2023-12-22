import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] R = new int[n];

		for (int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}

		int maxProfit = -2000000000;
		int minProfit = R[0];

		for (int i = 1; i < n; i++) {
			maxProfit = Math.max(maxProfit, R[i] - minProfit);
			minProfit = Math.min(minProfit, R[i]);
		}

		System.out.println(maxProfit);

		sc.close();
	}
}

