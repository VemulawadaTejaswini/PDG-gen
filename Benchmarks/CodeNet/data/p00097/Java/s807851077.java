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
    int param = ((numCount - 1) * (numCount - 2)) / 2;
    int startIndex = Math.min(LIMIT, sumNumber) - param;
    return solver2(numCount, sumNumber, 0, startIndex);
  }

  private static long solver2(int numCount, int sumNumber, int currentSum, int startIndex)
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
      int endIndex = startIndex / 2 + 1;
      for (int i = startIndex; i >= endIndex; i--)
      {
        int nextStartIndex = sumNumber - (currentSum + i);
        if (nextStartIndex == i)
        {
          nextStartIndex = i - 1;
        }
        ret += solver2(numCount - 1, sumNumber, currentSum + i, nextStartIndex);
      }
    }
    return ret;
  }

  private static long solver(int numCount, int sumNumber, int currentSum, int startIndex)
  {
    long ret = 0;
    int limit = sumNumber - currentSum;
    int param1 = (numCount - 1) * numCount / 2;
    startIndex = Math.max(startIndex, currentSum + LIMIT * numCount - param1);

    if (numCount == 1)
    {
      if (limit >= startIndex && limit <= LIMIT)
      {
        return 1;
      }
      return 0;
    }
    else
    {
      if (limit > LIMIT * numCount - param1)
      {
        return 0;
      }
      if (limit < startIndex * numCount + param1)
      {
        return 0;
      }
      for (int i = startIndex; i <= LIMIT; i++)
      {
        if (limit < startIndex && limit > LIMIT)
        {
          return 0;
        }
        long beforeRet = ret;
        ret += solver(numCount - 1, sumNumber, currentSum + i, i + 1);
        if (beforeRet == ret && ret > 0)
        {
          break;
        }
      }
    }
    return ret;
  }

}