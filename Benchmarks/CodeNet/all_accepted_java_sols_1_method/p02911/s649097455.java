import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q =sc.nextInt();
		int A[] = new int[Q];
		for(int i = 0; i < Q; i++) {
			A[i] = sc.nextInt() - 1;
		}
		
		int P[] = new int[N];
		Arrays.fill(P, K - Q);
		for(int i = 0; i < Q; i++) {
			P[A[i]]++;
		}
		for(int i = 0; i < N; i++) {
			if(P[i] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
