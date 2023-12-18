import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		
		double men = r * r * Math.PI;
		double en = 2 * r * Math.PI;
		
		System.out.println(String.format("%f %f", men, en));
	}
}