import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(",");

			double x0 = Double.parseDouble(nico[0]);
			double y0 = Double.parseDouble(nico[1]);
			double x1 = Double.parseDouble(nico[2]);
			double y1 = Double.parseDouble(nico[3]);
			double xq = Double.parseDouble(nico[4]);
			double yq = Double.parseDouble(nico[5]);
			
			double d = 0.0;
			if (x0 != x1) {
				double a = (y0 - y1) / (x0 - x1);
				double b = y0 - x0 * a;
				
				d = (yq - a * xq - b) / Math.sqrt(1 + a * a);
				
				double rad = Math.atan(a);
				
				System.out.println((xq + 2 * d * Math.sin(rad)) + " " + (yq - 2 * d * Math.cos(rad)));
			} else {
				System.out.println((xq - 2 * (xq - x0)) + " " + yq);
			}
		}
	}
}