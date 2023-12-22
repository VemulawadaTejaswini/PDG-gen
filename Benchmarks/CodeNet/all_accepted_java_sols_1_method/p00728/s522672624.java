import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}

			int sum = 0, minScore = 1000, maxScore = 0;
			for (int i = 0; i < n; i++) {
				int tmp = scanner.nextInt();
				sum += tmp;
				minScore = Math.min(minScore, tmp);
				maxScore = Math.max(maxScore, tmp);
			}

			System.out.println((sum - minScore - maxScore) / (n - 2));
		}
		scanner.close();
	}
}