import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double cos = Math.cos(c / 360 * 2 * Math.PI);
		double sin = Math.sin(c / 360 * 2 * Math.PI);
		double l = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * cos));
		double s = (a * b) / 2 * sin;
		double h = b * sin;
		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}
}

