import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] A = new long[N];
		long result = 1;
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			if(A[i] == 0)result = 0;
		}
		
		for(int i = 0; i < N; i++) {
			result *= A[i];
			if(result > (long)1e18 || ((A[i] > (long)1e18 )&&( result > 1))) {
				result = -1;
				break;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}