import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int maxv = Integer.MIN_VALUE;
		int minv = Integer.MAX_VALUE;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int input;

		for (int j = 0; j < n; j++) {
			input = scanner.nextInt();
			if (j == 0) {
				minv = input;
			} else {
				maxv = Math.max(maxv, input - minv);
				minv = Math.min(minv, input);
			}
		}

		System.out.println(maxv);
	}
}