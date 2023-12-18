import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		System.out.println(String.format("%f",
				Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
	}
}