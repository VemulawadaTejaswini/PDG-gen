import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long max = Long.MIN_VALUE;
		int A[] = new int[N];
		int C[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt() - 1;
		}
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int count = 0;
			long cost = 0;
			int now = A[i];
			Set<Integer> set = new HashSet<Integer> ();
			for (; count < N && count < K; count++) {
				if (set.contains(now)) {
					break;
				}
				set.add(now);
				cost += C[now];
				now = A[now];
				if (cost > max) {
					max = cost;
				}
			}
			if (count <K) {
				int roop = count ;
				if (cost>0) {
					cost = cost *(K/roop);
					if (cost > max) {
						max = cost;
					}
					for (int j=0;j<K%roop;j++) {
						cost += C[now];
						now = A[now];
						if (cost > max) {
							max = cost;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}