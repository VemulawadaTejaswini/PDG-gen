import java.util.Scanner;
import java.lang.Math;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		double r;
		double l,s;

		r = sc.nextDouble();

		l = 2*r*Math.PI;
		s = r*r*Math.PI;

		System.out.println(String.format("%.5f", l)+" "+String.format("%.5f", s));

		sc.close();
	}

}
