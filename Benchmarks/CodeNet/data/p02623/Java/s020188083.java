import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextInt();
		long[] A = new long[N + 1];
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt() + A[i - 1];
		}
		TreeSet<Long> B = new TreeSet<Long>();
		B.add(0L);
		for (int i = 1; i <= M; i++) {
			B.add(sc.nextInt() + B.last());
		}

		int result = 0;
		for (int i = 0; i <= N && A[i] <= K; i++) {
			int bcnt = B.headSet(K - A[i], true).size();
			if (result < i + bcnt - 1) {
				result = i + bcnt - 1;
			}
		}

		System.out.println(result);
	}
}
