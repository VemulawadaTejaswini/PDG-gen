import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double n1 = Math.PI * r * r;
		double n2 = Math.PI * 2 * r;
		System.out.println(String.format("%.6f", n1) + " " + String.format("%.6f", n2));
	}
}
