import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long mod = 1000000007;
		long n = sc.nextLong();
		long ans =modpow(10,n,mod)-2*modpow(9,n,mod)%mod+modpow(8,n,mod);
		ans%=mod;
		System.out.println(ans);
		
	}
	public static long modpow(long a,long n, long mod) {
		long res = 1;
		while(n > 0) {
			if((n & 1) == 1) {
				res = res*a % mod;
			}
			a = a*a % mod;
			n >>= 1;
		}
		return res;
	}

}