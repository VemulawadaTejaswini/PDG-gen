import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pi = 3.141;
		double r = scan.nextInt(); //????????§???????????\???
		double x = 2*r*pi;
		double y = r*r*pi;
		System.out.println(String.format("%.6f", x) + " " + String.format("%.6f", y));
	}
}