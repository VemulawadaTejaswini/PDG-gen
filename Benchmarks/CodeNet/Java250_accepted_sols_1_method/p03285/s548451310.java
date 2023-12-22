import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N <= 3) {
			System.out.println("No");
			return;
		}
		boolean found = false;
		int xMax = N / 4;
		int yMax = N / 7;
		for (int x = 0; x <= xMax; x++) {
			for (int y = 0; y <= yMax; y++) {
				if ((4 * x) + (7 * y) == N) {
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		System.out.println(found ? "Yes" : "No");
	}
}