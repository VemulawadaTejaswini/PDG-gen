import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();

    		long ans=0;

			for(int A=1; A<N; A++) {
				ans += (N-1)/A;
			}

			System.out.println(ans);
    	}
    }