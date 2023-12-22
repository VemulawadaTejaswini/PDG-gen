import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int height = scanner.nextInt();
		int width = scanner.nextInt();

		// ??¢???
		int area = height * width;

		// ??¨????????????
		int lengthOfAround = (height * 2) + (width * 2);

		System.out.println(area + " " + lengthOfAround);
	}

}