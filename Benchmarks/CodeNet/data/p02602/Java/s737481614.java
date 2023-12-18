import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// M-SOL_2020_C
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int K = sc.nextInt();
			Long A[] = new Long[N];

			for(int i=0; i<K; i++) {
				A[i] = sc.nextLong();
			}

			for(int i=K; i<N; i++) {
				A[i] = sc.nextLong();
				if(A[i-K] < A[i]) {
		    		System.out.println("Yes");
				} else {
		    		System.out.println("No");
				}
			}

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }