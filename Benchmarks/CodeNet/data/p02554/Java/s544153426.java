import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long mod = 1000000007;
		
		long ans = powmod(10,N)-powmod(9,N)-powmod(9,N)+powmod(8,N);
		ans %= mod;
		ans = (ans + mod) % mod;
		System.out.println(ans);
		
	}
	public static long powmod(long x, long n){
		long mod = 1000000007;
      	long res = 1;
      
		for(long i = 0; i < n; i++){
			res = res * x % mod;
		}
		return res;
	}
}
