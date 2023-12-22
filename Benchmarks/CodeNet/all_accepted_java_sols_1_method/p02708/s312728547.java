import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int MOD = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;
		long[] suml = new long[N+2];
		long[] sumr = new long[N+2];
		for(int i = 1; i <= N; i++) {
			suml[i] = suml[i-1];
			suml[i] += i;
		}
		for(int i = N; i >= 0; i--) {
			sumr[i] = sumr[i+1];
			sumr[i] += i;
		}
		for(int i = K; i <= N+1; i++) {
			ans += sumr[N+1-i]-suml[i-1]+1;
			ans %= MOD;
		}
		System.out.println(ans);
	}

}
