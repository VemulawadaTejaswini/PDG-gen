import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		double r;
		double l,s;

		r = sc.nextInt();

		l = 2*r*Math.PI;
		s = r*r*Math.PI;

		System.out.println(l+" "+s);

		sc.close();
	}

}
