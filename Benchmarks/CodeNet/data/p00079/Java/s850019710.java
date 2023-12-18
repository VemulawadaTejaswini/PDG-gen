import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String[] nico = sc.nextLine().split(",");
		double fx = Double.parseDouble(nico[0]);
		double fy = Double.parseDouble(nico[1]);

		nico = sc.nextLine().split(",");
		double ox = Double.parseDouble(nico[0]);
		double oy = Double.parseDouble(nico[1]);
		
		double s = 0.0;
		while (sc.hasNextLine()) {
			nico = sc.nextLine().split(",");
			double tx = Double.parseDouble(nico[0]);
			double ty = Double.parseDouble(nico[1]);

			double a = Math.sqrt((fx - ox) * (fx - ox) + (fy - oy) * (fy - oy));
			double b = Math.sqrt((fx - tx) * (fx - tx) + (fy - ty) * (fy - ty));
			double c = Math.sqrt((ox - tx) * (ox - tx) + (oy - ty) * (oy - ty));
			double z = (a + b + c) / 2;
			
			s = s + Math.sqrt(z * (z - a) * (z - b) * (z - c));
		}
		
		System.out.println(s);
	}
}