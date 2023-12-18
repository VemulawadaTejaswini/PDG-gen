
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 要素の個数
		Point2D.Double p1 = new Point2D.Double();
		Point2D.Double p2 = new Point2D.Double();
		p1.setLocation(0, 0);
		p2.setLocation(100, 0);
		System.out.println(p1.getX() + " " + p1.getY());
		kock(n, p1, p2);
		System.out.println(p2.getX() + " " + p2.getY());
	}

	/**
	 * コッホ曲線の各頂点座標を出力する
	 * @param n　	コッホ曲線の数
	 * @param p1　	始点座標
	 * @param p2　	終点座標
	 */
	public static void kock(int n, Point2D.Double p1, Point2D.Double p2) {
		if (n == 0) {
			return;
		}
		Point2D.Double s = new Point2D.Double();
		s.setLocation((2 * p1.x + 1 * p2.x) / 3, (2 * p1.y + 1 * p2.y) / 3);
		Point2D.Double t = new Point2D.Double();
		t.setLocation((1 * p1.x + 2 * p2.x) / 3, (1 * p1.y + 2 * p2.y) / 3);
		double u_x = (t.x - s.x) * Math.cos(60 * (Math.PI / 180)) - (t.y - s.y) * Math.sin(60 * (Math.PI / 180)) + s.x;
		double u_y = (t.x - s.x) * Math.sin(60 * (Math.PI / 180)) + (t.y - s.y) * Math.cos(60 * (Math.PI / 180)) + s.y;
		Point2D.Double u = new Point2D.Double();
		u.setLocation(u_x, u_y);

		kock(n - 1, p1, s);
		System.out.println(s.getX() + " " + s.getY());
		kock(n - 1, s, u);
		System.out.println(u.getX() + " " + u.getY());
		kock(n - 1, u, t);
		System.out.println(t.getX() + " " + t.getY());
		kock(n - 1, t, p2);

	}
}

