import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi = Math.PI;
		double area = r * r * pi;
		double length = (double) 2 * pi * r;
		System.out.printf("%f %f ", area, length);
	}
}

