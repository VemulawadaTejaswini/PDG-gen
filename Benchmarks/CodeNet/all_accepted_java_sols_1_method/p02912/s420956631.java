import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			pq.add((double)A[i]);
		}
		
		for(int i = 0; i < M; i++) {
			double temp = pq.poll();
			temp = temp / 2;
			pq.add(temp);
		}
		
		long ans = 0;
		for(int i = 0; i < N; i++) {
			ans += Math.floor(pq.poll());
		}
		System.out.println(ans);
	}
}
