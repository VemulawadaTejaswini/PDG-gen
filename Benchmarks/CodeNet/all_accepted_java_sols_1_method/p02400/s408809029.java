import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double r = scn.nextDouble();
		double h =2*Math.PI*r;
		double s = Math.PI* r*r;
		System.out.printf("%f %f", s, h);
	}
}

