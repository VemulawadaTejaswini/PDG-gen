import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = 3.141592653589;
		double r = sc.nextDouble();
		double area = r*r*p;
		double length = 2*r*p;

		System.out.printf("%f %f", area, length);
	}
}