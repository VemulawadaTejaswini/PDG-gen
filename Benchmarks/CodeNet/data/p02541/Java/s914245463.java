import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	long inv(long a,long M) {
		return a==1?a:(M+(-M*inv(M%a,a)+1)/a);
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		if (N==1) {
			System.out.println(1);
			return;
		}
		N*=2;
		long ans=Long.MAX_VALUE;
		for (long P=2;P*P<=N;++P) if (N%P==0) {
			long Q=N/P;
			if (gcd(P,Q)!=1) continue;
			long u=inv(P,Q);
			long v=(u*P-1)/Q;
			ans=Math.min(ans, v*Q);
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
