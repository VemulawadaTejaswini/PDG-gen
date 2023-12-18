import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a,b,c,d,e,f,x,y;

		while (sc.hasNext()) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();

			x = (c * e - f * b) / (a * e - d * b);
			y = (a * f - d * c) / (a * e - d * b);

			System.out.printf("%.3f %.3f\n", x , y);
		}
	}

}