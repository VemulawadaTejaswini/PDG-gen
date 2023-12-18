import java.util.*;

public class Main {
	static final int LEN = 41;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}
		
		long goal = 0;
		for(int i=2; i<N; i++)
			goal ^= A[i];
		
		System.out.println(solve(A[0], A[1], goal));
		sc.close();
	}
	
	static long solve(long a0, long a1, long goal) {
		
		long sum = a0+a1;
		if(sum < goal || ((sum-goal)&1)!=0)
			return -1;
		
		long and = (sum-goal)>>1;
		
		if((and&goal)!=0)
			return -1;
		
		long after = and;
		for(int i=LEN-1; i>=0; i--) {
			if((goal&(1l<<i)) != 0) {
				if((after|(1l<<i)) <= a0) {
					after |= 1l<<i;
				}
			}
		}
		
		return after > 0 ? a0-after : -1;
	}
}
