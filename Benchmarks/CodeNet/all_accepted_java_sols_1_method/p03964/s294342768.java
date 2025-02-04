import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T[] = new int[N];
		int A[] = new int[N];
		long xt = 1;
		long xa = 1;
		
		for(int i = 0; i < N; i++) {
			T[i] = Integer.parseInt(sc.next());
			A[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0; i < N; i++) {
			long kake = Math.max((xt - 1 + T[i])/T[i], (xa - 1 + A[i])/A[i]);
			xt = T[i] * kake;
			xa = A[i] * kake;
		}
		System.out.println(xt + xa);
	}
}
