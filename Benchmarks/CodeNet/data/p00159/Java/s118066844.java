import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		double minDiff;
		int minId;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			minDiff = Double.MAX_VALUE;
			minId = 0;
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				int height = sc.nextInt();
				int weight = sc.nextInt();

				if (Math.abs(22.0 - (1.0 * weight) / (1.0 * height / 100) / (1.0 * height / 100)) < minDiff) {
					minDiff = Math.abs(22.0 - (1.0 * weight) / (1.0 * height / 100) / (1.0 * height / 100));
					minId = number;
				}
			}
			
			System.out.println(minId);
		}
	}
}