import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		int width = sc.nextInt();

		int area = length * width;
		int perimeter = length * 2 + width * 2;

		System.out.println(area + " " + perimeter);

	}

}
