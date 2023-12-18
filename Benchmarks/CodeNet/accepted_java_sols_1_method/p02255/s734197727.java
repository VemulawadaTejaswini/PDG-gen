

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<A.length;i++) {
			A[i] = sc.nextInt();
		}

		int v,j;
		for(int x=0;x<A.length;x++) {

			int AN= A.length;
			System.out.print(A[x]);
			if(AN-1!=x) {
				System.out.print(" ");
				}
			}
		System.out.println();
		for(int i=1;i<A.length;i++) {
			 v = A[i];
			 j = i - 1;
			while(j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
				A[j+1] = v;
			}
			for(int x=0;x<A.length;x++) {

				int AN= A.length;
				System.out.print(A[x]);
				if(AN-1!=x) {
					System.out.print(" ");
					}
				}
			System.out.println();
		}
		sc.close();


	}

}

