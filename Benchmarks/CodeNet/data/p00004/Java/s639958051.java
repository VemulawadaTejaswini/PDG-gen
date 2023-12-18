import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			float a = in.nextFloat(), b = in.nextFloat(), c = in.nextFloat(), d = in
					.nextFloat(), e = in.nextFloat(), f = in.nextFloat();
			double x = (e*c-b*f)/(a*e-b*d),y = (-d*c+a*f)/(a*e-b*d);
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}