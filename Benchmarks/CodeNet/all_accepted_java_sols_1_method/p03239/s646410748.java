import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),T=sc.nextInt();
		int minCost = 1001;
		for(int i =0; i<N; i++) {
			int cost = sc.nextInt(),time = sc.nextInt();
			if(time > T) continue;
			if(minCost > cost) minCost = cost;
		}
		System.out.println(minCost == 1001? "TLE":minCost);
	}
}
