import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		
		while (sc.hasNextDouble()) {
			double d = sc.nextDouble();
			if (d - EPS < 48.00) {
				System.out.println("light fly");
			} else if (d > 48.00 && d - EPS < 51.00) {
				System.out.println("fly");
			} else if (d > 51.00 && d - EPS < 54.00) {
				System.out.println("bantam");
			} else if (d > 54.00 && d - EPS < 57.00) {
				System.out.println("feather");
			} else if (d > 57.00 && d - EPS < 60.00) {
				System.out.println("light");
			} else if (d > 60.00 && d - EPS < 64.00) {
				System.out.println("light welter");
			} else if (d > 64.00 && d - EPS < 69.00) {
				System.out.println("welter");
			} else if (d > 69.00 && d - EPS < 75.00) {
				System.out.println("light middle");
			} else if (d > 75.00 && d - EPS < 81.00) {
				System.out.println("middle");
			} else if (d > 81.00 && d - EPS < 91.00) {
				System.out.println("light heavy");
			} else {
				System.out.println("heavy");
			}
		}
	}
}