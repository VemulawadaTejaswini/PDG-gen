import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int lines = Integer.parseInt(sc.nextLine());
			if (lines == 0) break;

			double[] x = new double[lines];
			double[] y = new double[lines];
			for (int i = 0; i < lines; i++) {
				String[] nico = sc.nextLine().split(",");
				x[i] = Double.parseDouble(nico[0]);
				y[i] = Double.parseDouble(nico[1]);
			}
			
			int max = 1;
			for (int i = 0; i < lines; i++) {
				for (int j = (i + 1); j < lines; j++) {
					double d = calc(x[i], x[j], y[i], y[j]);
					
					if (d <= 4.0) {
						double cr = Math.atan2(-(y[j] - y[i]), (x[j] - x[i]));
						double dr = Math.atan2(Math.sqrt(1 - (d / (2.0 * 2.0))), (Math.sqrt(d) / 2.0));
						
						double[] px = new double[2];
						double[] py = new double[2];

						px[0] = x[i] + Math.cos(cr - dr);
						py[0] = y[i] - Math.sin(cr - dr);
						
						px[1] = x[i] + Math.cos(cr + dr);
						py[1] = y[i] - Math.sin(cr + dr);
						
						for (int p = 0; p < px.length; p++) {
							int tmp = 0;
							for (int k = 0; k < lines; k++) {
								if (calc(px[p], x[k], py[p], y[k]) <= 1.0) tmp++;
							}
							
							if (max < tmp) max = tmp;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
	
	public double calc(double x0, double x1, double y0, double y1) {
		return ((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}
}