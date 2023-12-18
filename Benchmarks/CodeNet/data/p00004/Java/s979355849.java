import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".000");
		while (sc.hasNext()) {
			double v[] = new double[6];
			for (int i = 0; i < 6; i++) {
				v[i] = sc.nextDouble();
			}
			double x = (v[4]*v[2] - v[1]*v[5]) / (v[0]*v[4] - v[1]*v[3]);
			double y = (v[0]*v[5] - v[3]*v[2]) / (v[0]*v[4] - v[1]*v[3]);
			System.out.println(df.format(x) + " " + df.format(y));
		}
	}
}