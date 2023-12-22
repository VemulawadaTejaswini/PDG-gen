import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N - 1];
		for (int i = 0; i < B.length; i++)
			B[i] = sc.nextInt();

		for (int i = 0; i < A.length; i++) {
			if (i == 0)
				A[i] = B[i];
			else if (i != A.length - 1)
				A[i] = B[i - 1] < B[i] ? B[i - 1] : B[i];
			else
				A[i] = B[i - 1];
		}
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			ans += A[i];
		}
		System.out.println(ans);
		sc.close();
	}
}