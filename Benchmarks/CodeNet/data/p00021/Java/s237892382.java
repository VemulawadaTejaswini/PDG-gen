import java.util.Scanner;

class Vector {
	private double pointX;
	private double pointY;

	Vector(double pointX, double pointY) {
		this.pointX = pointX;
		this.pointY = pointY;
	}

	public double getPointX() {
		return pointX;
	}
	public double getPointY() {
		return pointY;
	}
	public void setPointX(int pointX) {
		this.pointX = pointX;
	}
	public void setPointY(int pointY) {
		this.pointY = pointY;
	}


 }

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = (int)sc.nextDouble();
		
			for (int i = 0; i < n; i++) {
				judgePal();
			}
	}
	
	private static void judgePal() {
		
		Vector a = new Vector(sc.nextDouble(), sc.nextDouble());
		Vector b = new Vector(sc.nextDouble(), sc.nextDouble());
		Vector c = new Vector(sc.nextDouble(), sc.nextDouble());
		Vector d = new Vector(sc.nextDouble(), sc.nextDouble());

		Vector ab = new Vector(b.getPointX() - a.getPointX(), b.getPointY() - a.getPointY());
		Vector cd = new Vector(d.getPointX() - c.getPointX(), d.getPointY() - c.getPointY());

		if (cd.getPointY() / cd.getPointX() == ab.getPointY() / ab.getPointX()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		
	}

}

