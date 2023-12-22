import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[][] route = new int[N][2];
		for(int i = 0;i < N;++i) {
			route[i][0] = sc.nextInt();
			route[i][1] = sc.nextInt();
		}
		sc.close();
		
		int minCost = Integer.MAX_VALUE;
		for(int i = 0;i < N;++i)
			if(route[i][1] <= T && route[i][0] < minCost)
				minCost = route[i][0];
		
		if(minCost == Integer.MAX_VALUE)
			System.out.println("TLE");
		else
			System.out.println(minCost);
	}
}
