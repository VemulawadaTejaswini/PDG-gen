import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = Double.parseDouble(scan.next());
		double b = Double.parseDouble(scan.next());
		double c = Double.parseDouble(scan.next());
		c=Math.toRadians(c);
		scan.close();
		System.out.println(String.format("%6f\n%6f\n%6f\n"
				,0.5*a*b*Math.sin(c),a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c)),b*Math.sin(c)));
		}
}