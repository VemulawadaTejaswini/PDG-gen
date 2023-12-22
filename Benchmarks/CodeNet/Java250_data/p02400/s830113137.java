import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double are = 0;
		double circ = 0;

		are = r * r * Math.PI;
		circ = (r + r) * Math.PI;
				;
		System.out.printf("%f %f\n", are, circ);

	}
}