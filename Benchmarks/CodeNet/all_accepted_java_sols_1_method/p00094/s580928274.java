import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		final double s = 3.305785;

		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a * b / s);
	}
}