import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, temp;

		for (int in_counta = 0; in_counta <3000; in_counta++) {
			x = scanner.nextInt();
			y = scanner.nextInt();

			if (x == 0 && y == 0) {
				scanner.close();
				break;
			}

			if (x > y) {
				temp = x;
				x = y;
				y = temp;
			}

			System.out.println(x + " " + y);
		}
	}
}

