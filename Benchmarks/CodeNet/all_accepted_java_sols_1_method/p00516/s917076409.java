import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cost = new int[N];
		int[] point = new int[N];
		for(int i = 0; i < N; i++) cost[i] = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int border = sc.nextInt();
			for(int j = 0; j < N; j++) {
				if(cost[j] <= border) { point[j]++; break;}
			}
		}
		int best = 0;
		int bestidx = 0;
		for(int i = 0; i < N; i++) {
			if(i == 0 || best < point[i]) { best = point[i];bestidx = i;}
		}
		System.out.println(bestidx+1);
	}
}