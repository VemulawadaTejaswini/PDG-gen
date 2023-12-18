import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int d, a ;
		double x = 0, y = 0;
		double theta = 0;
		Scanner scn = new Scanner(System.in);
		while (true) {
			scn.useDelimiter(",|" + System.lineSeparator());
			d = scn.nextInt();
			a = scn.nextInt();
			if (a == 0 && d == 0)
				break;
			x += Math.sin(theta / 180 * Math.PI) * d;
			y += Math.cos(theta / 180 * Math.PI) * d;
			theta += a;
		}
		System.out.println( (int)x + " " + (int)y);
	}
}