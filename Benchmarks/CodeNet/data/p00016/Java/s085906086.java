import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import static java.lang.Math.cos;
//import static java.lang.Math.sin;
//import static java.lang.Math.toRadians;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		WalkMan boy = new WalkMan();

		String[] data = br.readLine().split(",");
		int d = Integer.parseInt(data[0]);
		int a = Integer.parseInt(data[1]);
		while (d != 0 || a != 0) {
			boy.move(d);
			boy.turn(a);

			data = br.readLine().split(",");
			d = Integer.parseInt(data[0]);
			a = Integer.parseInt(data[1]);
		}

		boy.printPos();
	}

	// position and direction
	public static class WalkMan {
		private double x; // east and west
		private double y; // north and south
		private int degree = 90; // direction

		public void turn(int a) {
			if (a >= 0) { // turn clockwise
				degree = degree - a;
			} else { // d < 0 turn counterclockwise
				degree = degree - a;
			}
		}

		public void move(int d) {
			x += d * Math.cos( Math.toRadians(degree) );
			y += d * Math.sin( Math.toRadians(degree) );
		}

		public void printPos() {
			System.out.println( (int)x );
			System.out.println( (int)y );
		}
	}
}