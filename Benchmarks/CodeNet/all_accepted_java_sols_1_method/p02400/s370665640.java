import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double p = Math.PI;


		System.out.printf("%.6f" + " " + "%.6f",r*r*p,2*p*r);
	}
}