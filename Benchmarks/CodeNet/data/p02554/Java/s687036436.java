import java.util.Scanner;

public class Main {
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

	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long all = modpow(10, N);
		long a0 = modpow(9, N);
		long a1 = modpow(9, N);
		long a2 = modpow(8, N);
		long x = (a0 + a1 - a2 + MOD) % MOD;
		long r = (all - x + MOD) % MOD;
//		System.out.println(all+" "+x+" "+r);
		System.out.println(r);
	}
}
