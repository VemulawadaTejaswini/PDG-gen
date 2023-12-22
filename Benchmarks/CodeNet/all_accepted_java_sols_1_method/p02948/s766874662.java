import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[][] = new int[N][2];
		boolean f[] = new boolean[N];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, Comparator.comparingInt(o -> o[0]));
		long ans = 0;
		int j = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i = 1; i <= M; i++) {
			while(j < N && A[j][0] <= i) {
				pq.add(A[j][1]);
				j++;
			}
			if(!pq.isEmpty()) {
				ans += pq.poll();
			}
		}
		System.out.println(ans);
	}
}
