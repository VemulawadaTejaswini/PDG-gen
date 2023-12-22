import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i < 3000) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if (0 <= x && x <= 10000 && 0 <= y && y <= 10000) {
				if (x == 0 && y == 0) {
					break;
				} else if (x <= y) {
					System.out.println(x + " " + y);
				} else {
					System.out.println(y + " " + x);
				}
			}
			i++;
		}

	}

}