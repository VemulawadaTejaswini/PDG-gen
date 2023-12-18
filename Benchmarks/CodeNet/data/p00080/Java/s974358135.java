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
      double num = Double.valueOf(input.readLine());
      if (num < 0)
      {
        break;
      }
      System.out.println(getThirdRoot(num, num / 2));
    }

  }

  private static float getThirdRoot(double q, double x)
  {
    if (Math.abs(Math.pow(x, 3) - q) < 0.00001 * q)
    {
      return (float) x;
    }

    return getThirdRoot(q, (float) (x - ((Math.pow(x, 3) - q) / (3 * Math.pow(x, 2)))));

  }

}