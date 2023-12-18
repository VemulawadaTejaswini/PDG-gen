import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        String[] tmp = scanner.nextLine().split(" ");
        int n = Integer.valueOf(tmp[0]);
        int m = Integer.valueOf(tmp[1]);
        int r = Integer.valueOf(tmp[2]);

        System.out.println(solver(n, m, r));
      }
    }
  }

  private static BigInteger solver(int n, int m, int r)
  {
    if (n * m > r)
    {
      return new BigInteger("0");
    }

    if (n * m == r)
    {
      return new BigInteger("1");
    }

    return hcombination(n, r-(n*m));
  }

  private static BigInteger hcombination(int n, int r)
  {
    BigInteger fact_a = fact(n+r-1);
    BigInteger fact_b = fact(r);
    BigInteger fact_c = fact(n-1);

    return fact_a.divide(fact_b.multiply(fact_c));
  }

  private static BigInteger fact(int n)
  {
    BigInteger ans = new BigInteger("1");

    for (int i = n; i > 1; i--)
    {
      ans = ans.multiply(new BigInteger(String.valueOf(i)));
    }
    return ans;
  }

}

