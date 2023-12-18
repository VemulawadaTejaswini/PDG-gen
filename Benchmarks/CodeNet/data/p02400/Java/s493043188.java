import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		double circumference = 2 * r * Math.PI;
		double area = r * r * Math.PI;
		System.out.println(String.format("%.6f",area) + " " + String.format("%.6f",circumference));
	}
}

