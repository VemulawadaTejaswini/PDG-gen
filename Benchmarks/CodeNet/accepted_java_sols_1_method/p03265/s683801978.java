import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		scanner.close();

		int xd = x2 - x1;
		int yd = y2 - y1;

		int x3 = x2 - yd;
		int y3 = y2 + xd;

		int x4 = x3 - xd;
		int y4 = y3 - yd;

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
