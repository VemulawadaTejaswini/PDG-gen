import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int xp0 = sc.nextInt();
			int yp0 = sc.nextInt();
			int xp1 = sc.nextInt();
			int yp1 = sc.nextInt();
			int xp2 = sc.nextInt();
			int yp2 = sc.nextInt();
			int xp3 = sc.nextInt();
			int yp3 = sc.nextInt();

			if (Geom.lineSegsIntersect(xp0, yp0, xp1, yp1, xp2, yp2, xp3, yp3)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		sc.close();
	}
	
	@SuppressWarnings("unused")
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

		static boolean lineSegsIntersect(int xa, int ya, int xb, int yb, int xc, int yc, int xd, int yd) {
			int abx = xb - xa;
			int aby = yb - ya;
			int acx = xc - xa;
			int acy = yc - ya;
			int adx = xd - xa;
			int ady = yd - ya;
			int cdx = xd - xc;
			int cdy = yd - yc;
			int cax = xa - xc;
			int cay = ya - yc;
			int cbx = xb - xc;
			int cby = yb - yc;

			return (cross(abx, aby, acx, acy) * Geom.cross(abx, aby, adx, ady) <= 0)
					&& (Geom.cross(cdx, cdy, cax, cay) * Geom.cross(cdx, cdy, cbx, cby) <= 0);
		}
	}
}