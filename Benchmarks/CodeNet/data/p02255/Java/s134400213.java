import java.util.Scanner;

/*insertionSort(A, N) // N??????????´??????????0-?????????????????????A
2   for i ??? 1 ?????? N-1 ?????§
3     v = A[i]
4     j = i - 1
5     while j >= 0 ?????? A[j] > v
6       A[j+1] = A[j]
7       j--
8     A[j+1] = v*/

public class Main {
	public static void main(String args[]) {
		int i, j, v, N;
		int a[] = new int[1000];

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			System.out.print(a[i]);
			if (i < N - 1)
				System.out.print(" ");
		}
		System.out.println();

		for (i = 1; i < N; i++) {
			v = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > v) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = v;
			for (int k = 0; k < N; k++) {
				System.out.print(a[k]);
				if (k < N - 1)
					System.out.print(" ");
			}
			if (i < N - 1)
				System.out.println();
		}

	}

}