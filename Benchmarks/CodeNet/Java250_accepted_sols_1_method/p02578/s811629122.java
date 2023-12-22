import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];

		long ans = 0L;

		for(int i = 0; i<N; i++) {
			A[i] = sc.nextLong();
		}

		for(int i = 0; i<N-1; i++) {
			long x =A[i+1] - A[i];
			if(x<0) {
				ans -= x;
				A[i+1] -=x;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
