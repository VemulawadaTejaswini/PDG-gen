
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		double b = 3.141592653589;
		System.out.printf("%f %f\n", r * r * b, r * 2 * b);
		sc.close();
	}
}

