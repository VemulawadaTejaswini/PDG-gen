import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// M-SOL_2020_C
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int K = sc.nextInt();
			Long A[] = new Long[N];

			Long now = (long) 1;
			Long bef = (long) 0;

			for(int i=0; i<N; i++) {
				A[i] = sc.nextLong();
			}

			for(int i=0; i<K; i++) {
				now *= A[i];
			}

			for(int i=K; i<N; i++) {
				bef = now;
				if(A[i-K] == 0) {
					now = (long) 1;
					for(int j=i-K+1; j<=i; j++) {
						now *= A[j];
					}
				} else {
					now = now/A[i-K]*A[i];
				}

				if(now > bef) {
		    		System.out.println("Yes");
				} else {
		    		System.out.println("No");
				}
			}

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }