import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int a,b;
		boolean[][] road = new boolean[N+1][N+1];
		for(int i = 0; i < M; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			if (a < b) {
				road[a][b] = true;
			} else {
				road[b][a] = true;
			}
		}

		Queue<Integer> order = new ArrayDeque<>();
		boolean[] visit = new boolean[N+1];
		order.add(1);
		visit[0] = true;
		visit[1] = true;
		int[] number = new int[N+1];
		int n;

		while (!order.isEmpty()) {
			n = order.poll();
			for (int i = 1; i < N+1; i++) {
				if (n < i) {
					if (road[n][i] && !visit[i]) {
						order.add(i);
						visit[i] = true;
						number[i] = n;
					}
				} else if (i < n){
					if (road[i][n] && !visit[i]) {
						order.add(i);
						visit[i] = true;
						number[i] = n;
					}
				}
			}
		}

		System.out.println("Yes");
		for (int i = 2; i < N+1; i++) {
			System.out.println(number[i]);
		}
	}
}