import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double x1 = scan.nextDouble();
		Double y1 = scan.nextDouble();
		Double x2 = scan.nextDouble();
		Double y2 = scan.nextDouble();
		Double distance = Math.hypot(x1 - x2, y1 - y2);
		System.out.println(String.format("%.8f", distance));
	}
}