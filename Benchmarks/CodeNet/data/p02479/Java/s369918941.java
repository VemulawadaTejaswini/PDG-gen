import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double PI = Math.PI;
		double r = sc.nextInt();
		double a = r*r*PI;
		double b = 2*r*PI;
		System.out.println(a + " " + b);
	}
}