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
    return solver(numCount, sumNumber, 0, 0);
  }

  private static long solver(int numCount, int sumNumber, int currentSum, int startIndex)
  {
    long ret = 0;
    if (numCount - 1 == 0)
    {
      for (int i = startIndex; i < 101; i++)
      {
        if (currentSum + 100 < sumNumber)
        {
          return ret;
        }
        if (currentSum + i == sumNumber)
        {
          ret++;
        }
      }
    }
    else
    {
      for (int i = startIndex; i < 101; i++)
      {
        if (currentSum >= sumNumber)
        {
          return ret;
        }
        ret += solver(numCount - 1, sumNumber, currentSum + i, i + 1);
      }
    }
    return ret;
  }

}