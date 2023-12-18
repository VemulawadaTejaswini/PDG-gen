import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		boolean flag = true;
		int count = 0;
		while (flag) {
			flag = false;
			int temp = 0;
			for (int i = 1; i < N; i++) {
				if (A[i - 1] > A[i]) {
					temp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = temp;
					count++;
					flag = true;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				System.out.println(A[i]);
			} else {
				System.out.print(A[i] + " ");
			}
		}
		System.out.println(count);
	}
}
