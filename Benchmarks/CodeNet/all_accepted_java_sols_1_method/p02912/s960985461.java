import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for(int i = 0; i < n; i++) {
			que.add(-1 * sc.nextInt());
		}
		for(int i = 0; i < m; i++) {
			int max = que.poll()/2;
			que.add(max);
		}
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum -= que.poll();
		}
		System.out.println(sum);
		sc.close();
	}

}