import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		double x = 0.0;
		double y = 0.0;
		int angleDeg = 90;
		while(in.hasNext()) {
			String s = in.next();
			String[] lr = s.split(",");
			int d = Integer.parseInt(lr[0]);
			int a = Integer.parseInt(lr[1]);

			// go to d[m]
			x += d * Math.cos(Math.toRadians(angleDeg));
			y += d * Math.sin(Math.toRadians(angleDeg));

			// rotate a human
			angleDeg -= a;

			if(d==0 && a == 0) {
				break;
			}
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}

}