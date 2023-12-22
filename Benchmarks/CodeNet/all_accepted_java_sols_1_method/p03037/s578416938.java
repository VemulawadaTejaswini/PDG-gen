import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();

		for (int i = 2; i < M + 1; i++) {
			int Li = sc.nextInt();
			int Ri = sc.nextInt();

			if (max < Li) {
				System.out.println(0);
				return;
			}

			if (min < Li) {
				min = Li;
			}

			if (max > Ri) {
				max = Ri;
			}
		}

		System.out.println(max - min + 1);
	}
}