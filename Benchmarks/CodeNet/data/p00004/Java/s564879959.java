import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		Scanner scn = new Scanner(System.in);
		final float EPS = 0.001f;
		try {
			while (true) {
				float sim_eq[] = new float[6];
				float x, y;
				for (int i = 0; i < 6; i++) {
					sim_eq[i] = scn.nextFloat();
				}
				float div = sim_eq[3] / sim_eq[0];
				sim_eq[0] *= div;
				sim_eq[1] *= div;
				sim_eq[2] *= div;
				y = (sim_eq[5] - sim_eq[2]) / (sim_eq[4] - sim_eq[1]);
				x = (sim_eq[5] - sim_eq[4] * y) / sim_eq[3];
				if(x < EPS && x > - EPS){
					x = 0f;
				}
				if(y < EPS && y > -EPS){
					y = 0f;
				}
				String x_str = String.format("%.3f", x);
				String y_str = String.format("%.3f", y);
				System.out.println(x_str + " " + y_str);
			}
		} catch (Exception e) {
		}
	}
}