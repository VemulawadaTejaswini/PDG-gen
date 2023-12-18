import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      final String[] PARAM_STR = input.readLine().split(" ");

      final double a = Double.valueOf(PARAM_STR[0]);
      final double b = Double.valueOf(PARAM_STR[1]);
      final double c = Double.valueOf(PARAM_STR[2]);
      final double d = Double.valueOf(PARAM_STR[3]);
      final double e = Double.valueOf(PARAM_STR[4]);
      final double f = Double.valueOf(PARAM_STR[5]);

      solver(a, b, c, d, e, f);
    }

  }

  private static void solver(double a, double b, double c, double d, double e, double f)
  {
    double det = 1 / ((a * e) - (b * d));
    double x = det * ((e * c) + (-b * f));
    double y = det * ((-d * c) + (a * f));

    if (x == -0)
      x = 0;
    if (y == -0)
      y = 0;

    System.out.printf("%.3f %.3f\n", x, y);

  }

}

