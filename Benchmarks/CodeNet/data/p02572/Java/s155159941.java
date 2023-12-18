import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			long lMod = 1000000007;
			long ans = 0;

			int N = sc.nextInt();
			long A[] = new long[N];

			for(int i=0; i<N; i++) {
				A[i] = sc.nextLong();
			}

			for(int i=0; i<N-1; i++) {
				for(int j=i+1; j<N; j++) {
					long wk = (A[i] * A[j])%lMod;

					ans = (ans+wk)%lMod;
				}
			}

    		System.out.println(ans);

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }