import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int max =0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (A[i]>B[i]) {
				max +=A[i]-B[i];
			}
		}
		System.out.println(max);
	}
}