import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		double r;

		Scanner stdIn = new Scanner(System.in);

		r = stdIn.nextDouble();

		System.out.format("%5f %5f", r*r*Math.PI, r*2*Math.PI);

	}

}