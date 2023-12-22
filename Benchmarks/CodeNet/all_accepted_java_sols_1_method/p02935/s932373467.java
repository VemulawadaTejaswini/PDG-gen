import java.util.Arrays;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			double v[]= new double[N];

			for(int i = 0; i < N; i++) {
				v[i] = sc.nextDouble();
			}

			for(int i=0; i<N-1; i++) {
				Arrays.parallelSort(v);
				v[0] = (v[0] + v[1]) / 2;
				v[1] = 9999;
			}

    		System.out.println(v[0]);

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}

    }