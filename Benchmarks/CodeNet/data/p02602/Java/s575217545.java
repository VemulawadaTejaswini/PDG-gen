import java.math.BigDecimal;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// M-SOL_2020_C
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int K = sc.nextInt();
			BigDecimal A[] = new BigDecimal[N];

			BigDecimal now = new BigDecimal(1);
			BigDecimal bef = new BigDecimal(0);

			for(int i=0; i<N; i++) {
				A[i] = sc.nextBigDecimal();
			}

			for(int i=0; i<K; i++) {
				now = now.multiply(A[i]);
			}

			for(int i=K; i<N; i++) {
				bef = now;
				if(A[i-K].compareTo(new BigDecimal(0)) == 0) {
					now = new BigDecimal(1);
					for(int j=i-K+1; j<=i; j++) {
						now = now.multiply(A[j]);
					}
				} else {
					now = now.divide(A[i-K]).multiply(A[i]);
				}

				if(now.compareTo(bef) > 0) {
		    		System.out.println("Yes");
				} else {
		    		System.out.println("No");
				}
			}

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }