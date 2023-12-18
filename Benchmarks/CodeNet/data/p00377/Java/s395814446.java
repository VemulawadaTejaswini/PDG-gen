import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner sc = new Scanner(System.in))
    {
      String[] tmp = sc.nextLine().split(" ");
      final int N = Integer.parseInt(tmp[0]);
      final int C = Integer.parseInt(tmp[1]);
      tmp = sc.nextLine().split(" ");
      int[] P = new int[C];
      for (int i = 0; i < C; i++)
      {
        P[i] = Integer.parseInt(tmp[i]);
      }

      System.out.println(solve(N, C, P));
    }
  }

  private static int solve(int N, int C, int[] P)
  {

    int sumCakePiace = 0;
    for (int i : P)
    {
      sumCakePiace += i;
    }

    int ret = sumCakePiace / (N + 1);

    if (sumCakePiace % (N + 1) > 0)
    {
      ret++;
    }

    return ret;
  }
}

