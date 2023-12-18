import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		//System.out.println(pow(m,n));
		System.out.println(pow(m,n,1000000007));
	}

	static long pow(int m, int n) {
		long res = 1;
		while (n>0) {
			if ((n&1)==1)
				res *= m;
			m *= m;
			n=n>>1;
		}
		return res;
	}
	
	static long pow(int m, int n, int mod) {
		long res = 1;
		while (n>0) {
			if ((n&1)==1)
				res = (res*m)%mod;
			m = (m*m)%mod;
			n=n>>1;
		}
		return res;
	}
	
}