import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute(System.in);
	}

	public void execute(InputStream in) {
		Scanner sc = new Scanner(in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		double rh = (h + (m / 60.0)) * 360 / 12.0;
		double rm = (m * 360 / 60.0);
		double r = Math.abs(rh - rm);
		r = Math.toRadians(r);

		double c = a * a + b * b - 2 * a * b * Math.cos(r);
		c = Math.sqrt(c);
		
		System.out.println(c);
		sc.close();
	}
}
