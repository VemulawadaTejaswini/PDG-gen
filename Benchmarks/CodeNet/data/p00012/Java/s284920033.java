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
		while(sc.hasNext()) {
			Vector a = new Vector(sc.nextDouble(), sc.nextDouble());
			Vector b = new Vector(sc.nextDouble(), sc.nextDouble());
			Vector c = new Vector(sc.nextDouble(), sc.nextDouble());
			Vector p = new Vector(sc.nextDouble(), sc.nextDouble());

			judgePoint(a, b, c, p);
		}

	}

	private static void judgePoint(Vector a, Vector b, Vector c, Vector p) {
		Vector pa = new Vector(a.getPointX() - p.getPointX(), a.getPointY() - p.getPointY());
		Vector pb = new Vector(b.getPointX() - p.getPointX(), b.getPointY() - p.getPointY());
		Vector pc = new Vector(c.getPointX() - p.getPointX(), c.getPointY() - p.getPointY());

		double op_pa_pb = pa.getPointX() * pb.getPointY() - pb.getPointX() * pa.getPointY();
		double op_pb_pc = pb.getPointX() * pc.getPointY() - pc.getPointX() * pb.getPointY();
		double op_pc_pa = pc.getPointX() * pa.getPointY() - pa.getPointX() * pc.getPointY();

			if (  ( op_pa_pb > 0 && op_pb_pc > 0 && op_pc_pa > 0 ) ||
					( op_pa_pb < 0 && op_pb_pc < 0 && op_pc_pa < 0 ) ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

	}

}
