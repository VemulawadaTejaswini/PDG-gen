import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		final double PI = 3.14159265358979;
		double a= PI*r*r,c=2*PI*r;
		System.out.println(String.format("%.8f", a) + " " + String.format("%.8f", c));
	}
}
