import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		double r;

		r=kb.nextDouble();

		System.out.printf( "%f %f\n", r*r*Math.PI, r*2*Math.PI );	
	}
}