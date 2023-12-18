import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r;

		r = scan.nextInt();

		System.out.printf("%.6f %.6f\n", r*r*Math.PI, 2*r*Math.PI);
	}
}