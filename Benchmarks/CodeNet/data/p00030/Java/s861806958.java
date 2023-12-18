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

      int ans = solver(numCount, sumNumber);
      System.out.println(ans);
    }

  }

  private static int solver(int numCount, int sumNumber)
  {
    return solver(numCount, sumNumber, 0, 0);
  }

  private static int solver(int numCount, int sumNumber, int currentSum, int startIndex)
  {
    int ret = 0;
    if (numCount - 1 == 0)
    {
      for (int i = startIndex; i < 10; i++)
      {
        if (currentSum + i == sumNumber)
        {
          ret++;
        }
      }
    }
    for (int i = startIndex; i < 10; i++)
    {
      ret += solver(numCount - 1, sumNumber, currentSum + i, i + 1);
    }
    return ret;
  }
}