import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        double a = Double.valueOf(scanner.nextLine());
        System.out.printf("%.8f\n", solver(a));
      }
    }
  }

  private static double solver(double a)
  {
    double ans = a;
    for (int i = 2; i <= 10; i++)
    {
      if (i % 2 == 0)
      {
        a *= 2.0;
      }
      else
      {
        a /= 3.0;
      }
      ans += a;
    }
    return ans;
  }
}

