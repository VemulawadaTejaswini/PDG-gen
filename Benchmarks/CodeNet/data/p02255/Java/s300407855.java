import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int tmp, i, j, k, l;

		for (i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (j = 0; j < N; j++) {
			tmp = A[j];
			k = j - 1;
			while (k >= 0 && A[k] > tmp) {
				A[k+1] = A[k];
				k--;
				A[k+1] = tmp;
			}
		}
		for (l = 0;l < N - 1; l++) {
			System.out.print(A[l] + " ");
		}
		System.out.println(A[N-1]);
	}
}
