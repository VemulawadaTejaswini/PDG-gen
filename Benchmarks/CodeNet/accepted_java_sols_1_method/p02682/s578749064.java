import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		K = K - A;
		if (K <= 0) {
			System.out.println(K + A);
		} else {
			K = K - B;
			if (K <= 0) {
				System.out.println(A);
			} else {
				System.out.println(A - K);
			}
		}
	}
}