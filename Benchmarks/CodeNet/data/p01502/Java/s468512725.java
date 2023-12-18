import java.util.Scanner;


public class Main {
	public static int INF = 1 << 24;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cost[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				cost[i][j] = stdIn.nextInt();
			}
		}
		long ans = 0; 
		for(int i = 0; i < n;i++) {
			for(int j = i+1; j < n; j++) {
				ans += Math.min(cost[i][j], cost[j][i]);
			}
		}
		System.out.println(ans);
	}
	
}

  