import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		long[]A = new long[N+1]; 
		A[0] = 1;
		
		for(int n=1; n<N+1; n++) {
			A[n] = keyboard.nextLong();
		}
		
		for(int i = K+1; i<N+1; i++) {
			if(A[i]>A[i-K]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		keyboard.close();
	}
}
