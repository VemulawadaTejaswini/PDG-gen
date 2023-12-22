import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i=0;i<n;i++) {
			h[i]=sc.nextInt();
		}
		long[] cost = new long[n];

		cost[0]=0;
		for (int i=1;i<n;i++) {
			cost[i]=Long.MAX_VALUE;
			for (int j=Math.max(0, i-k);j<i;j++) {
				cost[i]=Math.min(cost[i], cost[j]+Math.abs(h[i]-h[j]));
			}
		}
		System.out.println(cost[n-1]);
	}

}