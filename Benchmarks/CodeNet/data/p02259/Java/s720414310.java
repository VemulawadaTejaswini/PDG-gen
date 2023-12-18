import java.util.Scanner;

class Main {
	public static void trace(int N, int A[]) {
		for (int i = 0; i < N; ++i) {
			if (i > 0) System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static int bubbleSort(int N, int A[]) {
		int ans = 0, tmp;
		for (int i = 0; i < N - 1; ++i) {
			for (int j = N - 1; j > i; --j) {
				if (A[j - 1] > A[j]) {
					tmp = A[j - 1];
					A[j - 1] = A[j];
					A[j] = tmp;
					++ans;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A[] = new int[N], ans;
		for (int i = 0; i < N; ++i) A[i] = sc.nextInt();
		sc.close();
		ans = bubbleSort(N, A);
		trace(N, A);
		System.out.println(ans);
	}
}
