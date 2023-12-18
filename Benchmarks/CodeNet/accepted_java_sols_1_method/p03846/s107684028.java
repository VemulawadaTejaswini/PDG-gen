import java.util.Scanner;

public class Main {
	static final double MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int[]B = new int[N];
		for(int i = 0; i < N; i++) {
			B[A[i]]++;
		}
		if(N % 2 == 1) {
			if(B[0] != 1) {
				System.out.println(0);
				System.exit(0);
			}
			for(int i = 1; i < N; i++) {
				if(B[i] != 2 && B[i] != 0) {
					System.out.println(0);
					System.exit(0);
				}
			}
			long ans = 1;
			for(int i = 0; i < N / 2; i++) {
				ans *= 2;
				ans %= MOD;
			}
			System.out.println(ans);
		}else {
			for(int i = 1; i < N; i++) {
				if(B[i] != 2 && B[i] != 0) {
					System.out.println(0);
					System.exit(0);
				}
			}
			long ans = 1;
			for(int i = 0; i < N / 2; i++) {
				ans *= 2;
				ans %= MOD;
			}
			System.out.println(ans);
		}
	}
}