import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int area1 = a * b;
		int area2 = c * d;
		if (area1 >= area2) {
			System.out.println(area1);
		} else {
			System.out.println(area2);
		}

	}

}
