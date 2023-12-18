
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double angle = sc.nextInt();
		double radian = angle * Math.PI / 180;
		double h = b * Math.sin(radian);
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(radian));
		double s = a * h / (double)2;
		double l = a + b + c;
		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}
}

