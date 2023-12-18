import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] cost = new int[210];
		for (int j = -100; j <= 100; j++) {
			for (int i = 0; i < n; i++) {
				cost[j+100] += Math.pow(a[i]-j, 2);
			}
		}
		final int INF = Integer.MAX_VALUE / 10;
		int min = INF;
		for (int i = 0; i < 201; i++) {
					if (cost[i] < min) {
						min = cost[i];
					}
				}
		System.out.println(min);
	}
}
