import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double p = 3.141592653589;
		double r = scan.nextDouble(); //????????§???????????\???
		double x = 2*r*p;
		double y = r*r*p;
		System.out.println(String.format("%.6f", y) + " " + String.format("%.6f", x));
	}
}