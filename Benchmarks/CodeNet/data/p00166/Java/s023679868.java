import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sumAngle;
		double area1, area2;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			sumAngle = 0;
			area1 = 0;
			for (int i = 0; i < n - 1; i++) {
				int angle = sc.nextInt();
				area1 += Math.sin(Math.toRadians(angle));
				sumAngle += angle;
			}
			area1 += Math.sin(Math.toRadians(360 - sumAngle));

			n = sc.nextInt();
			sumAngle = 0;
			area2 = 0;
			for (int i = 0; i < n - 1; i++) {
				int angle = sc.nextInt();
				area2 += Math.sin(Math.toRadians(angle));
				sumAngle += angle;
			}
			area2 += Math.sin(Math.toRadians(360 - sumAngle));
			
			if (area2 < area1) {
				System.out.println("1");
			} else if (area1 < area2) {
				System.out.println("2");
			} else {
				System.out.println("0");
			}
		}
	}
}