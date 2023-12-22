import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();

		int m2 = h * 60 + m;
		int rev = 12 * 60;
		double hrot = (double)(m2)/rev;
		double mrot = (double)(m)/60;

		double hx = a * Math.sin(2 * Math.PI * hrot);
		double hy = a * Math.cos(2 * Math.PI * hrot);
		double mx = b * Math.sin(2 * Math.PI * mrot);
		double my = b * Math.cos(2 * Math.PI * mrot);
		double dx = hx - mx;
		double dy = hy - my;

		double dist = Math.pow(dx * dx + dy * dy, 0.5);

		System.out.println(dist);


	}

}