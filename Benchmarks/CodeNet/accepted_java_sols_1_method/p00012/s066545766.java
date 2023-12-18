import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()) {
			double x1, y1, x2, y2, x3, y3, px, py;
			x1 = stdIn.nextDouble();
			y1 = stdIn.nextDouble();
			x2 = stdIn.nextDouble();
			y2 = stdIn.nextDouble();
			x3 = stdIn.nextDouble();
			y3 = stdIn.nextDouble();
			px = stdIn.nextDouble();
			py = stdIn.nextDouble();

			double a = (x3 - x2) * (py - y2) - (y3 - y2) * (px - x2);
			double b = (x1 - x3) * (py - y3) - (y1 - y3) * (px - x3);
			double c = (x2 - x1) * (py - y1) - (y2 - y1) * (px - x1);

			if((a > 0 && b > 0 && c > 0) || (a < 0 && b < 0 && c < 0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}