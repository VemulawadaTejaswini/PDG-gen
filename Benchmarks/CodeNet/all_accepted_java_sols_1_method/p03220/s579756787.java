import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int a = scanner.nextInt();

		double bestDiff = -1;
		int bestPoint = 0;
		for (int i = 0; i < n; i++) {
			int h = scanner.nextInt();
			if (i == 0) {
				bestPoint = i + 1;
				bestDiff = Math.abs(a - (t- h * 0.006));
			} else {
				double diff = Math.abs(a - (t- h * 0.006));
				if (diff < bestDiff) {
					bestDiff = diff;
					bestPoint = i + 1;
				}
			}
		}
		System.out.println(bestPoint);
	}

}