import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double r = 0;

		Scanner in = new Scanner(System.in);

		r = in.nextDouble();

		double a =  2 * r * Math.PI;
		double b =  r * r * Math.PI;



		System.out.println( a+ " " + b);

	}

}