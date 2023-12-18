import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double x = x1 - x2;
		double y = y1 - y2;
		System.out.println(Math.sqrt((x*x) + (y*y)));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}