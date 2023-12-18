import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String[] params = sc.nextLine().split(" ");
			
			double[] points = new double[8];
			for (int j = 0; j < points.length; j++) {
				points[j] = Double.parseDouble(params[i]);
			}
			double dx0 = points[2] - points[0];
			double dy0 = points[3] - points[1];
			double dx1 = points[6] - points[4];
			double dy1 = points[7] - points[5];
			if (dx0 == 0.0) {
				if (dx1 != 0.0) {
					System.out.println("NO");
					continue;
				}
			}

			double d0 = dy0 / dx0;
			double d1 = dy1 / dx1;
			if (d0 == d1) System.out.println("YES");
			else System.out.println("YES");
		}
	}
}