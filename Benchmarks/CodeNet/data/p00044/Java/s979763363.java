
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> inputList = new ArrayList<>(50);

    try
    {
      while (input.ready())
      {
        inputList.add(Integer.valueOf(input.readLine()));
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    for (int num : inputList)
    {
      System.out.println(getLowerPrimeNumber(num) + " " + getHigherPrimeNumber(num));
    }
  }

  private static int getLowerPrimeNumber(int number)
  {
    for (int i = number - 1; i > 3; i--)
    {
      if (isPrimeNumber(i))
      {
        return i;
      }
    }
    return 2;
  }

  private static int getHigherPrimeNumber(int number)
  {
    for (int i = number + 1; i < Integer.MAX_VALUE; i++)
    {
      if (isPrimeNumber(i))
      {
        return i;
      }
    }
    return 2;
  }

  private static boolean isPrimeNumber(int number)
  {
    if (number % 2 == 0)
    {
      return false;
    }

    final int limit = (int) Math.sqrt(number);
    for (int i = 3; i <= limit; i++)
    {
      if (number % i == 0)
        return false;

    }

    return true;
  }
}