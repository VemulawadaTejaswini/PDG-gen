import java.util.Scanner;


public class Main {
	public static int count;
	public static int m;
	public static int[] G = new int[100];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		stdIn.close();
		shellSort(a, n);

		System.out.println(m);
		for (int i = m - 1; i >= 0; i--) {
			if (i != 0)
				System.out.print(G[i] + " ");
			else
				System.out.println(G[i]);
		}
		System.out.println(count);
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);

	}

	public static void insertionSort(int[] A, int n, int g) {
		for(int i = g; i < n; i++) {
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j -g;
				count++;
			}
			A[j + g] = v;
		}
	}

	public static void shellSort(int[] A, int n) {
		count = 0;
		m = 0;
		for(int i = 1; ;i = 3 * i + 1) {
			if(i > n) break;
			G[m] = i;
			m++;
		}

		for(int i = m - 1; i >= 0; i--) {
			insertionSort(A, n, G[i]);
		}
	}
}
