import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long inf = LMAX / 2 - MAX;

	void doIt() {
		int N = sc.nextInt();
		int num[] = new int[100001];
		Arrays.fill(num, 0);
		long sum = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			sum += A;
			num[A]++;
		}
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			int d = C - B;
			sum += d * num[B];
			num[C] += num[B];
			num[B] = 0;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
