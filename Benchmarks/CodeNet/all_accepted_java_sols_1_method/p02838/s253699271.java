import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextLong();

		final long MOD = 1000000007;
		
		int[] bit = new int[60];
		long[] counter = new long[60];
		for(int i=0; i<N; i++) {
			for(int j=0; j<60; j++) {
				if((A[i]&(1l<<j))==0) {
					counter[j] += bit[j];
				} else {
					counter[j] += i-bit[j];
					bit[j]++;
				}
			}
		}
		
		long ans = 0;
		for(int i=0; i<60; i++) {
			ans = (ans * 2) % MOD;
			ans = (ans + counter[60-i-1]) % MOD;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
