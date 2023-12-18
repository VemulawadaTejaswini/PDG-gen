import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		
		long result = 1;
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			result *= A[i];
			if(result > (long)1e18) {
				flag = false;
				break;
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(A[i] == 0) {
				result = 0;
				flag = true;
			}
		}
		
		System.out.println((flag)?result:-1);
		
		sc.close();
	}
}