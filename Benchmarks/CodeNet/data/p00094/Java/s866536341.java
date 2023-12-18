import java.util.Scanner;

public class Main
{
  static final double TSUBO = 3.305785;

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in);)
    {
      while (scanner.hasNextLine())
      {
        String[] strArray = scanner.nextLine().split(" ");
        double a = Double.valueOf(strArray[0]);
        double b = Double.valueOf(strArray[1]);
        solver(a, b);
      }
    }
  }

  private static void solver(double a, double b)
  {
    System.out.printf("%.6f\n" ,(a * b) / TSUBO);
  }
}

