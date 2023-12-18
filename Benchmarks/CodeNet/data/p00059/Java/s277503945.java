import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class rect {

		double xa;

		double ya;

		double xb;

		double yb;



		rect(double xa, double ya, double xb, double yb) {

			if (xa > xb) {

				double temp = xb;

				xb = xa;

				xa = temp;

			}

			if (ya > yb) {

				double temp = ya;

				ya = yb;

				yb = temp;

			}

			this.xa = xa;

			this.xb = xb;

			this.ya = ya;

			this.yb = yb;

		}



		boolean in(double x, double y) {

			if ((xa - x) * (xb - x) <= 0)

				if ((ya - y) * (yb - y) <= 0)

					return true;

			return false;

		}

	}



	void run() {

		for (; sc.hasNextDouble();) {

			double xa = sc.nextDouble();

			double ya = sc.nextDouble();

			double xb = sc.nextDouble();

			double yb = sc.nextDouble();

			rect a = new rect(xa, ya, xb, yb);

			xa = sc.nextDouble();

			ya = sc.nextDouble();

			xb = sc.nextDouble();

			yb = sc.nextDouble();

			rect b = new rect(xa, ya, xb, yb);

			boolean in = false;

			in |= a.in(b.xa, b.ya);

			in |= a.in(b.xb, b.yb);

			in |= b.in(a.xa, a.ya);

			in |= b.in(a.xb, a.yb);

			System.out.println(in?"YES":"NO");

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}