import java.util.Scanner;

public class Main {

	// ２点間の距離
	public static double getDistance (double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	// ヘロンの公式(３つの座標から求めるver)
	public static double getArea1 (double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = getDistance(x1,y1,x2,y2);
		double b = getDistance(x1,y1,x3,y3);
		double c = getDistance(x2,y2,x3,y3);
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			double area1 = getArea1(x1,y1,x2,y2,xp,yp);
			double area2 = getArea1(x1,y1,x3,y3,xp,yp);
			double area3 = getArea1(x2,y2,x3,y3,xp,yp);
			double area4 = area1 + area2 + area3;
			double area5 = getArea1(x1,y1,x2,y2,x3,y3);
			boolean res = Math.abs(area4 - area5) < 0.00001;
			System.out.println(res ? "YES" : "NO");
		}

	}

}