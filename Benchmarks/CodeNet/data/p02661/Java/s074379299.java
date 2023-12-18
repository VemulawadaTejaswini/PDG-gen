import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N =scan.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int num = 0;

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
		}

		sort(A, 0, N-1);
		sort(B, 0, N-1);

		if (N % 2 == 0) {
			num = B[N/2] + B[N/2-1] - A[N/2] - A[N/2-1] + 1;
		} else {
			num = B[(N-1)/2] - A[(N-1)/2] + 1;
		}

		System.out.println(num);
	}

	public static void sort(int[] x, int left, int right) {
		if (left >= right) {
			return;
		}

		int p = x[(left + right) / 2];
		int l = left;
		int r = right;
		int temp;

		while (l <= r) {
			while (x[l] < p) { l++; }
			while (x[r] > p) { r--; }
			if (l <= r) {
				temp = x[l];
				x[l] = x[r];
				x[r] = temp;
				l++;
				r--;
			}
		}

		sort(x, left, r);
		sort(x, l, right);
	}

}