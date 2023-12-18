import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();//赤
		int B = sc.nextInt();//緑
		int C = sc.nextInt();//青

		int K = sc.nextInt();

		sc.close();

		// 処理
		if (C > B && B > A) {
			System.out.print("Yes");
			return;
		}

		for (int i = 0; i < K; i++) {
			if (C > B && B > A) {
				System.out.print("Yes");
				return;
			}
			if (C > B && B <= A) {
				B = 2 * B;
				continue;
			}
			if (C <= B && B > A) {
				C = 2 * C;
				continue;
			}
			if (C <= B && B <= A) {
				B = 2 * B;
				continue;
			}
		}
		if (C > B && B > A) {
			System.out.print("Yes");
			return;
		}

		System.out.print("No");
	}

}
