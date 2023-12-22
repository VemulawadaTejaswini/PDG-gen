import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for (int k=0; k<N; k++) {
			if (k==0) {
				System.out.print(A[k]);
			} else {
				System.out.print(" "+A[k]);
			}
		}
		System.out.println();

		for (int i=1; i<N; i++) {
			int v = A[i];
			int j = i - 1;
			while (j>=0&&A[j]>v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for (int k=0; k<N; k++) {
				if (k==0) {
					System.out.print(A[k]);
				} else {
					System.out.print(" "+A[k]);
				}
			}
			System.out.println();
		}

		sc.close();
	}

}