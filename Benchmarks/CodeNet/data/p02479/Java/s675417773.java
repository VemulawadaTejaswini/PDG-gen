import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		
		double S = Math.PI * r * r;
		double l = 2 * r * Math.PI;
		System.out.printf("%.6f %.6f\n",S,l);
	}
}