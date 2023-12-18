import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		double r = 0;;
		if((a * a * b) / 2 >= x) {
			r = Math.atan((2 * x)/(a * b * b));
		}else {
			r = Math.atan((a * a * a)/(2 * (a * a * b - x)));
		}
		r = Math.toDegrees(r);
		System.out.println(90 -r);
	}

}
