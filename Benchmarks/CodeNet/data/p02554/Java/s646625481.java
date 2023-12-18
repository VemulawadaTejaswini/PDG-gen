import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		static long powmod(long x, long y) {
			long res=1;
			for(long i=0; i<y; i++) {
				res=res*x%mod;
			}
			return res;
		}

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			long ans = 0;

			int N = sc.nextInt();
    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();

			ans = powmod(10,N) - powmod(9,N) - powmod(9,N) + powmod(8,N);
			ans%=mod;
			ans=(ans+mod)%mod;

    		System.out.println(ans);
    	}
    }