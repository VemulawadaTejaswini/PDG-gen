import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int count = 0;

		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = N - 1; i >= 1; i--) {
				if (A[i] < A[i - 1]) {
					int x = A[i - 1];
					A[i - 1] = A[i];
					A[i] = x;
					count++;
					flag = true;
				}
			}
		}

		for (int i = 0; i < N - 1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[N - 1]);
		System.out.println(count);
	}
}

