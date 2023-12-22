import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		int y = (int) (x / 1.08);

		if (y * 1.08 == x) {
			System.out.println(y);
		} else if ((int) ((y + 1) * 1.08) == x) {
			System.out.println(y + 1);
		} else {
			System.out.println(":(");
		}
	}

}