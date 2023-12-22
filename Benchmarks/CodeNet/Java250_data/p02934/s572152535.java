import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}
		long deno = 1;
		for(long in: a) deno = lcm(in, deno);

		long num = 0;
		for(long in: a) num += deno / in;
		//System.out.println(deno);
		double ans = (double)deno / num;
		System.out.println(ans);
	
	}
	
	public static long gcd(long a, long b){
		if (a == 0) return b;
		return gcd(b % a, a);
	}
	
	public static long lcm(long a, long b){
		return a * b / gcd(a, b);
	}
}
