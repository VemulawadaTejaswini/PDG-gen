import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double squ = r * r * Math.PI;
		double shu = 2 * r * Math.PI;
		System.out.println(String.format("%8f", squ) + " " + String.format("%8f", shu));
	}
}
