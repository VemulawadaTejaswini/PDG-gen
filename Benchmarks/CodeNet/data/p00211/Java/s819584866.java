import java.util.*;
import java.math.*;

public class Main {
	static long gcd(int[] a) {
		long gcd = a[0];
		for(int i = 1; i < a.length; i++) {
			gcd = gcd(a[i],gcd);
		}
		return gcd;
		
	}
	static long lcm(int[] a) {
		long lcm = a[0];
		for(int i = 1; i < a.length; i++) {
			lcm = lcm(lcm,a[i]);
		}
		return lcm;
	}
	static long lcm(long m, long n) {
		return (m * n) / gcd(m,n);
	}
	
	static long gcd(long m, long n) {
		if(m < n) {
			long tmp = m;
			m = n;
			n = tmp;
		}
		if(n == 0) return m;
		
		return gcd(n,m % n);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] d = new int[n];
			int[] v = new int[n];
			for(int i = 0; i < n; i++) {
				d[i] = sc.nextInt();
				v[i] = sc.nextInt();
				int T = (int)gcd(d[i],v[i]);
				d[i] = d[i] / T; v[i] = v[i] / T;
			}
			long dd = lcm(d);
			long vv = gcd(v);
			
			long T = dd/vv;
			
			for(int i = 0; i < n; i++) {
				System.out.println((v[i] / vv) * (dd/ d[i]));
			}
			
		}
	}
}