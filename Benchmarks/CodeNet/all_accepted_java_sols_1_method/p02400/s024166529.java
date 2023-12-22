import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		double a = Math.pow(r,2) * Math.PI;
		double l = 2 * r * Math.PI;

		System.out.printf("%f %f",a ,l );
		sc.close();

	}

}
