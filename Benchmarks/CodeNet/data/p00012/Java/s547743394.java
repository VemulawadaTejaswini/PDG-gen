import java.util.*;

class Vector2 {
	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public static Vector2 sub(Vector2 a, Vector2 b) {
		return new Vector2(a.x - b.x, a.y - b.y);
	}
	public static double cross(Vector2 a, Vector2 b) {
		return a.x * b.y - a.y * b.x;
	}
	public double x, y;
}

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			Vector2 a = new Vector2(scanner.nextDouble(), scanner.nextDouble());
			Vector2 b = new Vector2(scanner.nextDouble(), scanner.nextDouble());
			Vector2 c = new Vector2(scanner.nextDouble(), scanner.nextDouble());
			Vector2 p = new Vector2(scanner.nextDouble(), scanner.nextDouble());
			Vector2 ab = Vector2.sub(b, a);
			Vector2 bp = Vector2.sub(p, b);
			Vector2 bc = Vector2.sub(c, b);
			Vector2 cp = Vector2.sub(p, c);
			Vector2 ca = Vector2.sub(a, c);
			Vector2 ap = Vector2.sub(p, a);
			double c0 = Vector2.cross(ab, bp);
			double c1 = Vector2.cross(bc, cp);
			double c2 = Vector2.cross(ca, ap);
			if ((c0 > 0 && c1 > 0 && c2 > 0) || (c0 < 0 && c1 < 0 && c2 < 0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}