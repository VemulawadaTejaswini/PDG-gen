import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] F = new long[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.setAll(F, i -> sc.nextInt());
		Arrays.sort(A);
		Arrays.sort(F);
		long lb = 0, ub = 1000000000000L;
		do {
			long mid = (ub+lb)/2;
			long c = 0;
			for(int i = 0; i < N; i++)
				if(mid < A[i]*F[N-1-i])
					c += A[i]-mid/F[N-1-i];
			if(c > K)
				lb = mid+1;
			else
				ub = mid;
		}while(lb < ub);
		System.out.println(ub);
	}

}