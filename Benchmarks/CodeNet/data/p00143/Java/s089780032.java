import java.awt.*;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Polygon poly = new Polygon();
			for (int j = 0; j < 3; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				poly.addPoint(x, y);
			}
			boolean k = poly.contains(sc.nextInt(), sc.nextInt());
			boolean s = poly.contains(sc.nextInt(), sc.nextInt());
			System.out.println(k ^ s ? "OK" : "NG");
		}
	}
}