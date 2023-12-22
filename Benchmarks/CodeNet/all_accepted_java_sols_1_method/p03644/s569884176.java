import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int max = 0;

		for (int i = 0; i <= N; i++) {
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (Math.pow(2, j) == i) {
					count = j;
				}
			}
			max = (max < count) ? count : max;
		}
		System.out.println((int)Math.pow(2, max));
	}

}