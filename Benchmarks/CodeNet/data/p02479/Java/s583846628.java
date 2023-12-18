
import java.util.Scanner;

public class circle {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		System.out.println(r * r * Math.PI + " " + r * 2 * Math.PI);
	}
}