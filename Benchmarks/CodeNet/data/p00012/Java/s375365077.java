import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  double[] x = new double[3];
  double[] y = new double[3];
  while (in.hasNext()) {
	{
	  for (int i = 0; i < 3; i++) {
		x[i] = in.nextDouble();
		y[i] = in.nextDouble();
	  }
	  double px = in.nextDouble();
	  double py = in.nextDouble();
	  for (int i = 0; i < 3; i++) {
		x[i] -= px;
		y[i] -= py;
	  }
	}
	double[] AB = f(x, y);
	if (AB[0] >= 0 && AB[1] >= 0) {
	  System.out.println("YES" + Arrays.toString(AB));
	} else {
	  System.out.println("NO" + Arrays.toString(AB));
	}
  }
}

private double[] abc(int[] in) {

  double D = in[0] * in[4] - in[1] * in[3];
  int xx = +in[4] * in[2] - in[1] * in[5];
  int yy = +in[0] * in[5] - in[3] * in[2];
  double ansX = (xx / D);
  double ansY = (yy / D);
  return new double[] { ansX, ansY };
}
  // x0x1x2
  // 0 1 2
  // y0y1y2
  // 3 4 5
private static double[] f(double[] x, double[] y) {
  x[2] = -x[2];
  y[2] = -y[2];
  double D = x[0] * y[1] - x[1] * y[0];
  double xx = +y[1] * x[2] - x[1] * y[2];
  double yy = +x[0] * y[2] - y[0] * x[2];
  return new double[] { (xx / D), (yy / D) };
}
}