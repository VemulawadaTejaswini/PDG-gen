

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = sc.nextInt();
		double[] A = new double[N];
		double sum = 0;
		int count = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}

		//System.out.println(1/(4*M) +","+ A[0]/sum);

		for(int i=0; i<N; i++) {
			if( 1/(4*M) <= A[i]/sum ) {
				count++;
			}
		}

		/*if(count >= M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}*/
		System.out.println(count >= M?"Yes":"No");



		sc.close();



	}

}
