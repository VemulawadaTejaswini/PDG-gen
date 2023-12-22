import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		for(int i=0; i<N+1; i++)
			A[i] = sc.nextInt();
		int[] B = new int[N];
		for(int i=0; i<N; i++)
			B[i] = sc.nextInt();

		long ans = 0;
		
		for(int i=0; i<N; i++) {
			int m1 = Math.min(A[i], B[i]);
			ans += m1;
			A[i] -= m1;
			B[i] -= m1;
			int m2 = Math.min(A[i+1], B[i]);
			ans += m2;
			A[i+1] -= m2;
			B[i] -= m2;
		}

		System.out.println(ans);
		sc.close();
	}
}