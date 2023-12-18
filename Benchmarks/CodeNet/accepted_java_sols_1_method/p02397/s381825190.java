import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while (i < 3001) {
			String line = sc.nextLine();
			String[] array = line.split(" ");
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[1]);
			if (x == 0 && y == 0) {
				break;
			} else if (x >= y) {
				System.out.println(y + " " + x);

			} else if (x < y) {
				System.out.println(x + " " + y);

			}
			i++;
		}

	}

}