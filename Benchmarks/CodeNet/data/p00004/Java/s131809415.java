import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double[] a = new double[6];
    while (s.hasNext()) {
      for (int i = 0; i < 6; i++)
        a[i] = s.nextDouble();
      double x = a[0] * a[4] - a[1] * a[3];
      double y = (a[4] * a[2] - a[1] * a[5]) / x;
      double z = (a[0] * a[5] - a[2] * a[3]) / x;
      System.out.printf("%.3f %.3f\n", y, z);
    }
  }
}