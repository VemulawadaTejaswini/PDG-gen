import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int width = scan.nextInt();
			int height = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int radius = scan.nextInt();

			if((x + radius) < width && (y + radius) < height && (x - radius) >= 0 && (y - radius) >= 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}