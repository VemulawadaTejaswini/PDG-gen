import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			if (x > y) {
				int tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(x + " " + y);
		}
	}
}