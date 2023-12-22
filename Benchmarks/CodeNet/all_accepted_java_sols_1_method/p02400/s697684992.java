import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double s =0.0,c = 0.0;
	     Scanner sc = new Scanner(System.in);
	     double r = sc.nextDouble();
	     s = r * r * Math.PI;
	     c = 2 * r * Math.PI;
	     System.out.println(String.format("%10f %10f",s,c));
	}
}

