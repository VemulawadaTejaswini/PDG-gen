import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();//半径
		//final double p = 3.1412372;
		double a;//面積
		double b;//円周

		a = (double) r * r * Math.PI;
		b = (double) r * 2 * Math.PI;

		//System.out.printf("%.6f",a);
		
		System.out.println(String.format("%.8f", a) + " " +  String.format("%.8f", b));

	}

}

