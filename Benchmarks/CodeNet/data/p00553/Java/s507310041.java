import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner sc = new Scanner(System.in))
    {
      while (sc.hasNext())
      {
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int D = sc.nextInt();
        final int E = sc.nextInt();

        System.out.println(solver(A, B, C, D, E));
      }
    }
  }

  private static int solver(int a, int b, int c, int d, int e)
  {
    int ans = 0;

    if (a < 0)
    {
      ans += (0 - a) * c + d;
      a = 0;
    }

    ans += (b - a) * e;

    return ans;
  }

}

