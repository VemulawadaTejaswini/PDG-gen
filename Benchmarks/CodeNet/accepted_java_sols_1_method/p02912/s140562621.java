import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		PriorityQueue<Double> que = new PriorityQueue<Double>();
		for(int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			que.add(-a);	// 逆順に
		}

		while(M > 0) {
			double p = que.poll();
			que.add(p / 2.0);
			M--;
		}

		long sum = 0;
		for(double price : que) {
			sum += -(long)(price);
		}
		System.out.println(sum);
	}
}