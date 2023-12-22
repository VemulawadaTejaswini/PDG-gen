import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		sc.close();

		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;

		double h = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		x3 = x2 + y1 - y2;
		y3 = y2 - x1 + x2;
		x4 = x1 + y1 - y2;
		y4 = x2 - x1 + y1;

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

	}
}