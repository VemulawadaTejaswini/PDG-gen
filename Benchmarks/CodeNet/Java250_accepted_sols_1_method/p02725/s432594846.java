import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int wa = 0, max = 0;;
		for(int i = 0; i < N; i++) {
			int a = 0;
			if(i == N - 1) a = K - A[i] + A[0];
			else a = A[i + 1] - A[i];
			wa += a;
			if(a > max) max = a;
		}
		System.out.println(wa - max);
	}
}