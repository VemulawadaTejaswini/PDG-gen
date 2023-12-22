

import java.math.BigInteger;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		BigInteger ans = BigInteger.ZERO;
		for (long i=1;i*i<n;i++) {
			if (n%i==0 && n/i-1>i) {
				ans=ans.add(BigInteger.valueOf(n/i-1));
			}
		}
		System.out.println(ans);
	}



}



