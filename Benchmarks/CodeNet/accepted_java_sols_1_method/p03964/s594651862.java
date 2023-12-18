import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T[] = new long[N];
		long A[] = new long[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		
		long t = 1;
		long a = 1;
		for(int i = 0; i < N; i++) {
			long n = Math.max(t / T[i], a / A[i]);
			while(T[i] * n < t || A[i] * n < a) n++;
			t = T[i] * n;
			a = A[i] * n;
		}
		System.out.println(t + a);
	}
}
