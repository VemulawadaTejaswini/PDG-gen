import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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
      MathContext mc = new MathContext(7, RoundingMode.HALF_DOWN);
      //BigDecimal ans = new BigDecimal(getThirdRoot(num, num / 2)).round(mc);
      BigDecimal ans = new BigDecimal(getThirdRoot(num, num / 2)).setScale(6,
          RoundingMode.HALF_DOWN);
      System.out.println(ans.toPlainString());
    }

  }

  private static double getThirdRoot(double q, double x)
  {
    if (Math.abs(Math.pow(x, 3) - q) < 0.00001 * q)
    {
      return x;
    }

    return getThirdRoot(q, x - ((Math.pow(x, 3) - q) / (3 * Math.pow(x, 2))));

  }

}