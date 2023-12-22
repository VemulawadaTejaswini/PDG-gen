import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		int M = sc.nextInt();

		int L[] = new int[M];
		int R[] = new int[M];

		int maxL = 1;
		int minR = 100000;

		for (int j = 0; j < M; j++) {
			L[j] = sc.nextInt();
			R[j] = sc.nextInt();

			if (maxL <= L[j]) {
				maxL = L[j];
			}

			if (minR >= R[j]) {
				minR = R[j];
			}

		}

		for (int i = 1; i <= N; i++) {
			if (maxL <= i && i <= minR) {
				count++;
			}
		}

		System.out.print(count);
	}
}