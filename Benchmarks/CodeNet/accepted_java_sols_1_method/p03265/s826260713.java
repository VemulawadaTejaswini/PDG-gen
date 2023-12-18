import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int dx = x2 - x1;
		int dy = y2 - y1;

		System.out.printf("%d %d %d %d", x2 - dy, y2 + dx, x1 - dy, y1 + dx);
		System.out.println();

		return;
	}
}
