import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 1_000_000_007;
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		int neg = 0, zero = 0, plus = 0;
		long ans = 1;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			if(A[i] > 0)
				plus++;
			else if(A[i] == 0)
				zero++;
			else
				neg++;
		}
		if((neg / 2 * 2) + plus >= K && (plus != 0 || K % 2 == 0)) {
			// ans > 0
			Arrays.sort(A);	
			List<Long> l = new ArrayList<>();
			for(int i = 1; i < N; i+=2) {
				if(A[i] >= 0)
					break;
				l.add(A[i] * A[i-1]);
			}
			if(K % 2 == 1) {
				ans = A[N-1];
				K--;
				N--;
			}
			for(int i = N-2; i >= 0; i-=2) {
				if(A[i] <= 0)
					break;
				l.add(A[i] * A[i+1]);
			}
			Collections.sort(l, Collections.reverseOrder());
			for(int i = 0; i < K / 2; i++)
				ans = ans * (l.get(i) % MOD) % MOD;
			System.out.println(ans);
		}
		else {
			// ans <= 0
			if(zero > 0) {
				System.out.println(0);
				return;
			}
			// ans < 0
			long[] abs = new long[N];
			for(int i = 0; i < N; i++)
				abs[i] = Math.abs(A[i]);
			Arrays.sort(abs);
			ans = -1;
			for(int i = 0; i < K; i++)
				ans = ans * abs[i] % MOD;
			System.out.println((ans + MOD) % MOD);
		}
	}

}