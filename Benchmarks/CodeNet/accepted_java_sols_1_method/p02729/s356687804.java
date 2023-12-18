
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		/* if (N == 1 && M == 1) {
			System.out.println(0);
		} else if (N == 1) {
			System.out.println(M * (M - 1) / 2);
		} else if (M == 1) {
			System.out.println(N * (N - 1) / 2);
		} else {
			System.out.println(N * (N - 1) / 2 + M * (M - 1) / 2);
		}*/
		System.out.println(N * (N - 1) / 2 + M * (M - 1) / 2);
		scan.close();
	}
}
