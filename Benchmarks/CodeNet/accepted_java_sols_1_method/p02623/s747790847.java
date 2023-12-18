import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		long[] SA = new long[N+1];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			SA[i+1] = SA[i] + A[i];
		}
		int[] B = new int[M];
		long[] SB = new long[M+1];
		for(int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
			SB[i+1] = SB[i] + B[i];
		}
		int ans = 0;
		for(int i = 0; i <= N; i++) {
			long c = K - SA[i];
			if(c < 0)
				break;
			int lb = -1, ub = M+1, mid;
			while(lb + 1 < ub) {
				mid = (lb + ub) / 2;
				if(SB[mid] > c)
					ub = mid;
				else
					lb = mid;
			}
			ans = Math.max(ans, lb + i);
		}
		System.out.println(ans);
	}

}