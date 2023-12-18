import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Max = 1, Min = 1000000000;

		for (int n = 0; n < N; n++) {
			int A = scanner.nextInt();
			Max = Math.max(Max, A);
			Min = Math.min(Min, A);
		}
		scanner.close();
		int A = Max - Min;
		System.out.println(A);

	}
}