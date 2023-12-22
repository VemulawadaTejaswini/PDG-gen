import java.util.Scanner;

public class Main {
	public static void main(String[] age){
		double P = Math.PI;
		Scanner sb = new Scanner(System.in);
		double r = sb.nextDouble();
		double s = r*r*P;
		double l = 2*r*P;
		String S = String.format("%.6f",s);
		String L = String.format("%.6f", l);
		System.out.println( S + " " + L);
	}
}