import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];

		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(A);
		long k = A[0];
		Deque<Long> que = new ArrayDeque<Long>();
		que.add(A[0]);
		long m = k;
		for(int i = 1; i < N; i++) {
			if(A[i] % k != 0) {
				que.add(A[i]);
				m = Math.min(m, A[i] % k);
			}
		}
		k = m;
		while(!que.isEmpty()) {
			long t = que.pop();
			if(t % k != 0) {
				k = t % k;
				que.add(t);
			}
		}
		System.out.println(k);
	}
}