import java.util.Scanner;
import java.lang.Math;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double p = Math.PI;

		System.out.printf(2*p*r + " " + r*r*p);
	}
}