import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		int xMax = w - r;
		int xMin = r;
		int yMax = h - r;
		int yMin = r;

		if (x < xMin || x > xMax) {
			System.out.println("No");
		} else if (y < yMin || y > yMax) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}