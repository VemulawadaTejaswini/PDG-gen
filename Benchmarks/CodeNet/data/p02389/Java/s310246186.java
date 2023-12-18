import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		int area = height*width;
		int perimeter = 2*(height+width);
		System.out.println(area + " " + perimeter);
		scanner.close();
	}
}

