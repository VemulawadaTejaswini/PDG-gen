import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			long lMod = 1000000007;

			int N = sc.nextInt();
			long A[] = new long[N];
			long wk = 0;

			for(int i=0; i<N; i++) {
				A[i] = sc.nextLong();
				wk += A[i];
			}

			long ans = wk*wk;

			for(int i=0; i<N; i++) {
				ans -= A[i]*A[i];
			}
			ans = (ans/2)%lMod;

			System.out.println(ans);

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }