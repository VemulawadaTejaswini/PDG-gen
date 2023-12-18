import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int xdiff = x2 - x1;
		int ydiff = y2 - y1;

		int x3 = x2 - ydiff;
		int y3 = y2 + xdiff;

		int x4 = x3 - xdiff;
		int y4 = y3 - ydiff;

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}