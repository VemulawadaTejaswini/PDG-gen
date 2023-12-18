

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] pts=new long[N];
		for(int i=0; i<N; i++) {
			pts[i]=sc.nextLong();
		}
		long lm=1;
		for(int i=0; i<N; i++) {
			lm=lcm(lm,pts[i]);
		}
		System.out.println(lm);
	}
	public static long lcm(long m, long n) {
		return m / gcd(m, n)*n;
	}
	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}
