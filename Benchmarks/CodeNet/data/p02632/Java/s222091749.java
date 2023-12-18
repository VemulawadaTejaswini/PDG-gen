import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int S = sc.next().length();
		
		long rev25 = rev(25);
		long pow25k = pow(25, K);
		long combsk_s = comb(S+K, S);
		long ans = 0;
		for(int i=0; i<=K; i++) {
			ans = (ans + combsk_s*pow25k)%MOD;
			
			pow25k = (pow25k*rev25)%MOD;
			combsk_s = (combsk_s * (K-i))%MOD;
			combsk_s = (combsk_s * rev(S+1+i))%MOD;
		}
//		System.out.println((comb(S+K, S)*pow(25, K))%MOD);
		System.out.println(ans);

		sc.close();
	}
	
	static long comb(long a, long b) {
		long ans = 1;
		for(int i=0; i<b; i++)
			ans = (ans * (a-i))%MOD;
		for(int i=0; i<b; i++)
			ans = (ans * rev(b-i))%MOD;

		return ans;
	}
	
	static long rev(long a) {
		return pow(a, MOD-2);
	}
	
	static long pow(long a, long b) {
		long ans = 1;
		while(b>0) {
			if((b&1)!=0)
				ans = (ans * a)%MOD;
			a = (a * a)%MOD;
			b>>=1;
		}
		
		return ans;
	}
}
