import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		long[] B = new long[N];
		long S = 0;
		long S1 = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
			S += A[i];
			if(i%2 == 1) {
				S1 += A[i];
			}
		}
		B[0] = S - 2*S1;
		
		for(int i = 1; i < N; i++) {
			B[i] = 2*A[i-1] - B[i-1];
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(B[i]);
		}

	}

}