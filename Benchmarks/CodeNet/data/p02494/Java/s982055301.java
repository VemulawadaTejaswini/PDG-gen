import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			for (int i = 1; i <= w; i++) {
				for (int j = 1; j <= h; j++) {
					System.out.println("#");
				}
				System.out.println("\n");
			}
		}
	}
}