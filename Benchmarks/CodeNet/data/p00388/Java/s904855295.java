import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    try (Scanner sc = new Scanner(System.in))
    {
      while (sc.hasNext())
      {
        final int H = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();

        System.out.println(solver(H, A, B));
      }
    }
  }

  private static int solver(int h, int a, int b)
  {
    int ans = 0;
    for (int i = a; i <= b; i++)
    {
      if (h % i == 0)
      {
        ans++;
      }
    }
    return ans;
  }
}

