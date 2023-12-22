
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		double rad = c * Math.PI / 180;
		double h = b * Math.sin(rad);
		double S = a * h / 2;
		double L = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(rad)) + a + b;
		

		System.out.printf("%.8f\n",S);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",h);
	}
}