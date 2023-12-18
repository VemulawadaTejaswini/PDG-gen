import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			A[a - 1]++;
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}
	}
}