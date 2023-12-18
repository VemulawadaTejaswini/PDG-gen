import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int e = scanner.nextInt();

			int x = 0;
			int y = 0;
			int z = 0;

			while (e > ((z + 1)^3)) {
				z++;
			}
			if (e == x + (y^2) + (z^3)) {
				System.out.println(x + y + z);
				break;
			}

			while (e - (z^3) > ((y + 1)^2)) {
				y++;
			}
			if (e == x + (y^2) + (z^3)) {
				System.out.println(x + y + z);
				break;
			}

			while (e - (z^3) - (y^2) > ((x + 1))) {
				x++;
			}
			if (e == x + (y^2) + (z^3)) {
				System.out.println(x + y + z);
				break;
			}
		}

		scanner.close();
	}
}

