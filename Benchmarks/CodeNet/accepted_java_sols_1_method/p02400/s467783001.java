
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double r = 0;

		Scanner in = new Scanner(System.in);

		r = in.nextDouble();

		double a =  r * r * Math.PI;
		double b =  2 * r * Math.PI;

		String A =  String.format("%f", a);
		String B =  String.format("%f", b);

		System.out.println(A + " " + B);

	}

}