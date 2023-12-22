import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int cost[] = new int[n];
		int time[] = new int[n];
		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
			time[i] = sc.nextInt();
		}
		int ans = getMinCostKeiro(n, t, cost, time);
		if (ans == 1001)
			System.out.println("TLE");
		else
			System.out.println(ans);
	}

	public static int getMinCostKeiro(int n, int t, int[] cost, int[] time) {
		int minCostKeiro = 1001;
		for (int i = 0; i < n; i++) {
			if (cost[i] < minCostKeiro && time[i] <= t)
				minCostKeiro = cost[i];
		}
		return minCostKeiro;
	}
}