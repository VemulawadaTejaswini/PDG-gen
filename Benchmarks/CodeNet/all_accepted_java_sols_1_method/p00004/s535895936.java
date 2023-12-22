import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double[] d = new double[6];
    while (s.hasNext()) {
      for (int i = 0; i < 6; i++)
        d[i] = s.nextDouble();
      double a = d[0] * d[4] - d[1] * d[3];
      double x = (d[4] * d[2] - d[1] * d[5]) / a;
      double y = (d[0] * d[5] - d[2] * d[3]) / a;
      if (x == 0) x = 0;
      if (y == 0) y = 0;
      System.out.printf("%.3f %.3f\n", x, y);
    }
  }
}