import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		long result = 0;
		long[] A = new long[N + 1];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextLong();
			result += A[i];
		}

		long[] B = new long[N + 1];
		long[] C = new long[N + 1];
		
		long[] limit = new long[N + 1];
		Arrays.fill(limit, Long.MAX_VALUE);
		limit[0] = 1;

		for(int i = 1; i < N + 1; i++) {
			if(limit[i - 1] <= Long.MAX_VALUE / 2)limit[i] = limit[i - 1] * 2;
			else break;
		}
		
		boolean flag = true;
		if(A[0] == 0)B[0] = 1;
		else if(A[0] == 1) B[0] = 0;
		else flag = false;
		for(int i = 1; i < N + 1; i++) {
			B[i] = B[i - 1] * 2 - A[i];
			if(B[i] < 0) {
				flag = false;
				break;
			}
		}
		
		
		if(flag) {
			C[N] = 0;
			for(int i = N - 1; i >= 0; i--) {
				C[i] = Math.min(C[i + 1] + A[i + 1], limit[i] - A[i]);
			}
			
			for(int i = 0; i < N + 1; i++) {
				result += Math.min(B[i], C[i]);
			}
			
		}
		
		System.out.println((flag)?result:-1);
		
		
		sc.close();
	}
}