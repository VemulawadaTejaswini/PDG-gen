import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int cu = 0, cd = 0;
			for (int j = 1; j < n; j++) {
				int b = scanner.nextInt();
				if (b - a > cu) {
					cu = b - a;
				}
				else if (b - a < cd) {
					cd = b - a;
				}
				a = b;
			}
			System.out.println(cu + " " + -cd);
		}
		scanner.close();
	}

}
