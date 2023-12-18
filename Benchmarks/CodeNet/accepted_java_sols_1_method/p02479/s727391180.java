
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		System.out.printf("%f %f", r * r * Math.PI, r * 2 * Math.PI);
	}
}