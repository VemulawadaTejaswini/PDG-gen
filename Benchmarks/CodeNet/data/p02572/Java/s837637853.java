import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextLong();
		}
		long mod = 1000000007;
		long sum = 0;
		long ans = 0;
		
		for(int i = 0; i < N-1; i++){
			for(int j = i+1; j < N; j++){
				sum = (A[i] % mod) *( A[j] % mod);
 				ans += sum % mod;
			}
		}
		System.out.println(ans%mod);
	}
}