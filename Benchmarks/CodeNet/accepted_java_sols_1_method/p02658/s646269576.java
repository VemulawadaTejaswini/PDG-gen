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
			long temp = 1;
			temp = result * A[i];
			if(temp > (long)1e18 || result > temp) {
				result = -1;
				break;
			}
			result = temp;
		}
		
		System.out.println(result);
		
		sc.close();
	}
}