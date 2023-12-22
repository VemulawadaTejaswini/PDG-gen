import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		double max = a * a * b;
		if (x == max / 2) {
		    System.out.println(45.0);
		} else if (x > max / 2) {
		    double target = max - x;
		    double c = target * 2 / a / a;
		    System.out.println(Math.atan2(c, a) * 180d / Math.PI);
		} else {
		    double c = x * 2 / a / b;
		    System.out.println(90 - Math.atan2(c, b) * 180d / Math.PI);
		}
	}
}
