import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[M];
		int ans = 0;
		A[0] = sc.nextLong();
		for(int i = 1; i < N; i++) {
			A[i] = sc.nextLong() + A[i - 1];
		}
		if(A[N - 1] <= K) ans = N;
		B[0] = sc.nextLong();
		for(int i = 1; i < M; i++) {
			B[i] = sc.nextLong() + B[i - 1];
		}
		if(B[M - 1] <= K) ans = Math.max(ans, M);
		long time = 0;
		int cnt = M - 1;
		out : for(int i = 0; i <= N; i++) {
			if(i != 0) {
				time = A[i - 1];
				if(time > K) {
					continue;
				}
			}
			for(int j = cnt; j >= 0; j--) {
				if(time + B[j] <= K) {
					ans = Math.max(ans, i + j + 1);
					cnt = j;
					continue out;
				} else {
					cnt = j;
				}
			}
		}
		System.out.println(ans);
	}
}
