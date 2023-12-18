import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int xp0 = sc.nextInt();
		int yp0 = sc.nextInt();
		int xp1 = sc.nextInt();
		int yp1 = sc.nextInt();

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int xp2 = sc.nextInt();
			int yp2 = sc.nextInt();

			int ax = xp1 - xp0;
			int ay = yp1 - yp0;
			int bx = xp2 - xp0;
			int by = yp2 - yp0;
			int dot = Geom.dot(ax, ay, bx, by);
			int cross = Geom.cross(ax, ay, bx, by);
			int a2 = Geom.sumofsquare(ax, ay);

			if (cross > 0) {
				System.out.println("COUNTER_CLOCKWISE");
			} else if (cross < 0) {
				System.out.println("CLOCKWISE");
			} else {
				if (dot < 0) {
					System.out.println("ONLINE_BACK");
				} else if (dot > a2) {
					System.out.println("ONLINE_FRONT");
				} else {
					System.out.println("ON_SEGMENT");
				}
			}
		}

		sc.close();
	}
	
	private static class Geom {
		static int dot(int xa, int ya, int xb, int yb) {
			return xa * xb + ya * yb;
		}

		static int cross(int xa, int ya, int xb, int yb) {
			return xa * yb - xb * ya;
		}
		
		static int sumofsquare(int xa, int ya) {
			return xa * xa + ya * ya;
		}
	}
}