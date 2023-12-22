import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length;
		while ((length = scanner.nextInt()) > 0) {
			int sum = 0;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < length; i++) {
				int next = scanner.nextInt();
				sum = sum + next;
				if (min > next) {
					min = next;
				}
				if (max < next) {
					max = next;
				}
			}
			System.out.println((sum - min - max) / (length - 2));
		}
		scanner.close();
	}
}