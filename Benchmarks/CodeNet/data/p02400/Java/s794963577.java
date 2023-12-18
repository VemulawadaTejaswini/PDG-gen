import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();

	    double menseki=r*r*3.141592653589;
	    double gaisyuu=r*2*3.141592653589;

	    System.out.println(String.format("%.6f", menseki) + " " + String.format("%.6f", gaisyuu));

	}

}