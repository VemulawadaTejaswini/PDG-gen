import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007L;
	static long modpow(long n, long y){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}
	static long modinv(long n){
		return modpow(n , MOD - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		int N = sc.nextInt();
		long A[] = new long[N];
		long S = 0;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
			S = (S + A[i]) % MOD;
		}
		long ret = S * S;
		for(int i = 0 ; i < N ; ++i){
			long A2 = A[i] * A[i];
			A2 = A2 % MOD;
			ret = (ret + MOD - A2) % MOD;
		}
		ret = (ret * modinv(2)) % MOD;
		System.out.println(ret);
	}
}
