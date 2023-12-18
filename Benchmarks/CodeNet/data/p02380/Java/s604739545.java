import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double C = scan.nextDouble();
		scan.close();
		double S = a * b * Math.sin(C/180*Math.PI) / 2;
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C/180*Math.PI));
		double l = a + b + c;
		double h = 2 * S / a;
		System.out.println(S);
		System.out.println(l);
		System.out.println(h);
	}
}
