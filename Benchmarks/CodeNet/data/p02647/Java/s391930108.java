import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		if (N <= K) {
			Arrays.fill(A, N);
		} else {
			for (int i = 0; i < K; i++) {
				A = calc(A);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (long ans : A) {
			sb.append(ans).append(" ");
		}
		System.out.println(sb);
	}
	
	private static long[] calc(long[] ar) {
		long[] res = new long[ar.length];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <= ar[i]; j++) {
				if (j == 0) {
					res[i]++;
				} else {
					if (-1 < i-j) {
						res[i-j]++;
					}
					if (i+j < res.length) {
						res[i+j]++;
					}	
				}
			}
		}
		return res;
	}
}