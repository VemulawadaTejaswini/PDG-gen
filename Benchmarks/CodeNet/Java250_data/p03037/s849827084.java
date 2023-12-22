
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long left=Long.MIN_VALUE;
		long right=Long.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			left = Math.max(left, A);
			right = Math.min(right, B);

			if (left > right) {
				System.out.println(0);
				break;
			}

			if (i == M-1) {
				System.out.println(right-left+1);
				break;
			}

		}

	}
}


