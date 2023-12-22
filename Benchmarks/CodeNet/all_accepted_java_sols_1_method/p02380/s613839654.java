import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		double a = scane.nextDouble();

		double b = scane.nextDouble();

		double C = scane.nextDouble();

		System.out.println(a*(b*Math.sin(Math.toRadians(C)))/2);

		System.out.println(a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*Math.cos(Math.toRadians(C)))));

		System.out.println(Math.sin(Math.toRadians(C))*b);

	}

}