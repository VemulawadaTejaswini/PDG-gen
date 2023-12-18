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

		static boolean lineIntersect(int xa, int ya, int xb, int yb, int xc, int yc, int xd, int yd) {
			/*
			 * ??´???AB??¨??????CD??¨??????????????????????????????
			 * 
			 * |AB|==0 && |CD|==0
			 *     ???A==???C
			 * |AB|==0 && |CD|!=0
			 *     ACxAD==0 && AC.AD<0
			 * |AB|!=0
			 *     ABxAC*ABxAD<=0
			 */
			int xab = xb - xa;
			int yab = yb - ya;
			if (xab != 0 || yab != 0) {
				int xac = xc - xa;
				int yac = yc - ya;
				int xad = xd - xa;
				int yad = yd - ya;
				return (long)cross(xab, yab, xac, yac) * cross(xab, yab, xad, yad) <= 0;
			} else {
				int xcd = xd - xc;
				int ycd = yd - yc;
				if (xcd != 0 || ycd != 0) {
					int xac = xc - xa;
					int yac = yc - ya;
					int xad = xd - xa;
					int yad = yd - ya;
					return cross(xac, yac, xad, yad) == 0 && dot(xac, yac, xad, yad) < 0;
				} else {
					return xa == xc && ya == yc;
				}
			}
		}

		static boolean lineSegsIntersect(int xa, int ya, int xb, int yb, int xc, int yc, int xd, int yd) {
			/*
			 * ??????AB??¨??????CD??¨??????????????????????????????
			 * 
			 * |AB|==0 && |CD|==0
			 *     ???A==???C
			 * |AB|==0 && |CD|!=0
			 *     ACxAD==0 && AC.AD<0
			 * |AB|!=0 && |CD|==0
			 *     CAxCB==0 && CA.CB<0
			 * |AB|!=0 && |CD|!=0
			 *     ABxCD==0
			 *         ACxAD==0 && (AB.AC>=0 || AB.AD>=0) && (BA.BC>=0 || BA.BD>=0)
			 *     ABxCD!=0
			 *         ABxAC*ABxAD<=0 && CDxCA*CDxCB<=0
			 */
			int xab = xb - xa;
			int yab = yb - ya;
			int xcd = xd - xc;
			int ycd = yd - yc;
			if ((xab != 0 || yab != 0) && (xcd != 0 || ycd != 0)) {
				int xac = xc - xa;
				int yac = yc - ya;
				int xad = xd - xa;
				int yad = yd - ya;
				if (cross(xab, yab, xcd, ycd) != 0) {
					int xca = -xac;
					int yca = -yac;
					int xcb = xb - xc;
					int ycb = yb - yc;
					return ((long)cross(xab, yab, xac, yac) * cross(xab, yab, xad, yad) <= 0)
							&& ((long)cross(xcd, ycd, xca, yca) * cross(xcd, ycd, xcb, ycb) <= 0);
				} else {
					int xba = -xab;
					int yba = -yab;
					int xbc = xc - xb;
					int ybc = yc - yb;
					int xbd = xd - xb;
					int ybd = yd - yb;
					return cross(xac, yac, xad, yad) == 0
							&& (dot(xab, yab, xac, yac) >= 0 || dot(xab, yab, xad, yad) >= 0)
							&& (dot(xba, yba, xbc, ybc) >= 0 || dot(xba, yba, xbd, ybd) >= 0);
				}
			} else if (xab != 0 || yab != 0) {
				int xca = xa - xc;
				int yca = ya - yc;
				int xcb = xb - xc;
				int ycb = yb - yc;
				return cross(xca, yca, xcb, ycb) == 0 && dot(xca, yca, xcb, ycb) < 0;
			} else {
				if (xcd != 0 || ycd != 0) {
					int xac = xc - xa;
					int yac = yc - ya;
					int xad = xd - xa;
					int yad = yd - ya;
					return cross(xac, yac, xad, yad) == 0 && dot(xac, yac, xad, yad) < 0;
				} else {
					return xa == xc && ya == yc;
				}
			}
		}
	}
}