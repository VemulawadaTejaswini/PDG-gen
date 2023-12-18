import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
 
public class Main {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long mod = 1000000007;
		long n = sc.nextInt();
		System.out.println(modpow(10,n,mod)-2*modpow(9,n,mod)+modpow(8,n,mod));
		
	}
	public static long modpow(long a,long n, long mod) {
		long res = 1;
		;
		while(n > 0) {
			if((n & 1) == 1) {
				res = res*a % mod;
			}
			a = a*a % mod;
			n >>= 1;
			//System.out.println(" " +res);
		}
		return res;
	}

}