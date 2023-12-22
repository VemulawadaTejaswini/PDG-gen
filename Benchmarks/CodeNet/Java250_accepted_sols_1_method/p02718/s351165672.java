

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = sc.nextInt();
		int[] A = new int[N];
		double sum = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		sc.close();
		int temp;
		int n=A.length;
		for(int i=0; i<n-1; i++) { //降順に並び替え
			for(int j=i+1; j<n; j++) {
				if(A[i]<A[j]) {
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}

		double line = 1/(4*M);


		for(int i=0; i<M; i++) {
			if( A[i]/sum < line ) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");



	}

}
