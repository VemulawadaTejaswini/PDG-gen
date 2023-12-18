import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int t = h * 60 + m;
		
		double thetaA = 0.0;
		if (0 <= t && t < 180) {
			thetaA = (180 - 5) * 0.5;
		} else if (180 <= t && t < 540) {
			thetaA = 360 - (t - 180) * 0.5;
		} else if (540 <= t) {
			thetaA = 180 - (t - 540) * 0.5;
		}
		
		double thetaB = 0.0;
		if (0 <= m && m < 15) {
			thetaB = (15 - m) * 6.0;
		} else if (15 <= m && m < 45) {
			thetaB = 360 - (m - 15) * 6.0;
		} else if (45 <= m) {
			thetaB = 180 - (m - 45) * 6.0;
		}
		
		double radA = Math.toRadians(thetaA);
		double radB = Math.toRadians(thetaB);
		
		double xA = a * Math.cos(radA);
		double yA = a * Math.sin(radA);
		double xB = b * Math.cos(radB);
		double yB = b * Math.sin(radB);
		
//		System.out.println("thetaA=" + thetaA);
//		System.out.println("thetaB=" + thetaB);
//		
//		System.out.println("xA=" + xA);
//		System.out.println("yA=" + yA);
//		System.out.println("xB=" + xB);
//		System.out.println("yB=" + yB);
		
		double dist = Point.distance(xA, yA, xB, yB);
		System.out.println(dist);
	}
}
