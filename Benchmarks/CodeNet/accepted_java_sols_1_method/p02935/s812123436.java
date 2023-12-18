import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] d = new double[N];
		Queue<Double> queue = new PriorityQueue<>();
		for(int i = 0 ;i < N; i++) {
			queue.add(sc.nextDouble());
		}
		sc.close();
		
		for(int i = 0; i < N - 1; i++) {
			double d1 = queue.poll();
			double d2 = queue.poll();
			queue.add((d1+d2)/2);
		}
		System.out.println(queue.poll());
	}
}