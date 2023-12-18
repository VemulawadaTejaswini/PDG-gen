import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			int H = scn.nextInt();
			int M = scn.nextInt();

			double longAngle = M * 6;
			double shortAngle = H * (360/12) + M * 0.5;

			double angle = 0;

			if(longAngle < shortAngle) {
				longAngle = 360 + longAngle;
				angle = longAngle - shortAngle;
			} else {
				angle = longAngle - shortAngle;
			}

			//余弦定理
			System.out.println(Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) -2*A*B*Math.cos(Math.toRadians(angle))));
		}
	}
}