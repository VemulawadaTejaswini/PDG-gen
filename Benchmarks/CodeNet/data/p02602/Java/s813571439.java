import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		long[]A = new long[N+1]; 
		long[]AA = new long[N+1]; 
		A[0] = 1;
		AA[0] = 1;
		
		for(int n=1; n<=K; n++) {
		long a1 = keyboard.nextLong();
			AA[n] = a1;
			A[n] = A[n-1]*a1; 
		}
		for(int n2 = K+1; n2<N+1; n2++) {
			long a2 = keyboard.nextLong();
			AA[n2] = a2;
			A[n2] = A[n2-1]*a2/AA[n2-K]; 
		}

		for(int i = K+1; i<N+1; i++) {
			if(A[i] > A[i-1]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		keyboard.close();
	}
}