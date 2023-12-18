import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  final private static int LIMIT = 100;

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      String[] INPUT_STR = input.readLine().split(" ");
      int numCount = Integer.valueOf(INPUT_STR[0]);
      int sumNumber = Integer.valueOf(INPUT_STR[1]);

      if (numCount == 0 && sumNumber == 0)
      {
        break;
      }

      long ans = solver(numCount, sumNumber);
      System.out.println(ans);
    }
  }

  private static long solver(int numCount, int sumNumber)
  {
    int startIndex = Math.min(LIMIT, sumNumber - sumUp(numCount - 1));
    return solver(numCount, sumNumber, 0, startIndex);
  }

  private static long solver(int numCount, int sumNumber, int currentSum, int startIndex)
  {
    long ret = 0;

    int currentLimit = sumNumber - currentSum;

    if (numCount == 1)
    {
      if (currentLimit <= startIndex)
      {
        return 1;
      }
      return 0;
    }
    else
    {
      int i = startIndex;
      while (true)
      {
        int nextStartIndex = sumNumber - (currentSum + i);
        if (nextStartIndex >= i)
        {
          nextStartIndex = i - 1;
        }
        ret += solver(numCount - 1, sumNumber, currentSum + i, nextStartIndex);
        if (sumNumber - (currentSum + i) >= (i - 1) * (numCount - 1))
        {
          break;
        }
        if (numCount > i)
        {
          break;
        }
        if (sumNumber - (currentSum + i) < sumUp(numCount - 2))
        {
          break;
        }
        i--;
      }
    }
    return ret;
  }

  private static int sumUp(int num)
  {
    int ret = 0;
    for (int i = 1; i < num; i++)
    {
      ret += i;
    }
    return ret;
  }
}