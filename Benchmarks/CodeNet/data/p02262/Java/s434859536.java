import java.util.Scanner;

public class Main {

	static int cnt = 0;
	final static int[] H = {797161, 265720, 88573, 29524, 9841,
			3280, 1093, 364, 121, 40, 13, 4, 1};

	static void insertionSort(int[] A, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = A[i];
			int j = i - g;
			while (j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j + g] = v;
		}
	}

	static void shellSort(int[] A, int n) {
		cnt = 0;
		int m;

		int i;
		for (i = 0; i < H.length; i++) {
			if (n >= H[i])
				break;
		}

		m = H.length - i;
		int[] G = new int[m];
		System.arraycopy(H, H.length-m, G, 0, m);
		
		System.out.println(m);
		
		for (i = 0; i < m; i++) {
			System.out.print(G[i]);
			if (i != m-1) {
				System.out.print(" ");
			}
			insertionSort(A, n, G[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}

		shellSort(A, n);

		System.out.println(cnt);

		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}

		scan.close();
	}

}