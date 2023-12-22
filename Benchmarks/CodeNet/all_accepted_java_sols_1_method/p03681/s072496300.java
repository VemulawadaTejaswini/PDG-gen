import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long M = input.nextLong();
		int n = (int)(N);
		int m = (int)(M);
		long mod = (long)(1e9+7);
		if (Math.abs(M-N)>=2) System.out.println(0);
		else {
			long[] fact = new long[1000005];
			fact[1]=1;
			for (long i = 2; i <= 100000; i++) {
				int index = (int)(i);
				fact[index]=fact[index-1]*i;
				fact[index]%=mod;
			}
			long ans = fact[n]*fact[m]; //Only one arrangement possible disregarding distinguishability
			ans%=mod;
			if (Math.abs(N-M)==1) {
				System.out.println(ans);
			}else {
				ans*=2; //Swapping is allowed when N=M
				ans%=mod;
				System.out.println(ans);
			}
		}
	}
}