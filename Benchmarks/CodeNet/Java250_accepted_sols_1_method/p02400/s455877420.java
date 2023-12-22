import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = Math.PI * r * r;
		double circle = 2 * Math.PI * r;
		System.out.printf("%.6f%s%.6f", area," ",circle);
	}
}