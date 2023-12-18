import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3, x4, y4;
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			x1 = scn.nextDouble();
			y1 = scn.nextDouble();
			x2 = scn.nextDouble();
			y2 = scn.nextDouble();
			x3 = scn.nextDouble();
			y3 = scn.nextDouble();
			x4 = scn.nextDouble();
			y4 = scn.nextDouble();
			if ((x1 - x2) * (y3 - y4) == (x3 - x4) * (y1 - y2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		scn.close();

	}
}
