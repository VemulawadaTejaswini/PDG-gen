import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = sc.nextInt();
		}
		int[] cost = new int[n];
		cost[0] = 0;
		cost[1] = Math.abs(h[0] - h[1]);
		int tmp1;
		int tmp2;
		for(int i=2;i<n;i++) {
			tmp1 = Math.abs(h[i-1] - h[i]) + cost[i-1];
		    tmp2 = Math.abs(h[i-2] - h[i]) + cost[i-2];
		    cost[i] = Math.min(tmp1, tmp2);
		}
		
		System.out.println(cost[n-1]);
		

	}

}
