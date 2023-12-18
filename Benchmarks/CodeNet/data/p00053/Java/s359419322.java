import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
  private static ArrayList<Integer> primeNumberList = new ArrayList<>();

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> inputList = new ArrayList<>(50);

    while (input.ready())
    {
      int inputNum = Integer.valueOf(input.readLine());
      if (inputNum == 0)
      {
        break;
      }
      inputList.add(inputNum);
    }

    int max = 0;
    for (Integer each : inputList)
    {
      if (max < each)
        max = each;
    }

    setPrimeNumberList(max);

    for (int num : inputList)
    {
      System.out.println(sumOfPrimeNumbers(num));
    }
  }

  private static int sumOfPrimeNumbers(int count)
  {
    int ans = 0;
    for (int i = 0; i < count; i++)
    {
      ans += primeNumberList.get(i);
    }
    return ans;
  }

  private static void setPrimeNumberList(int listSize)
  {
    int num = 3;

    primeNumberList.add(2);
    while (primeNumberList.size() < listSize)
    {
      if (isPrimeNumber(num))
      {
        primeNumberList.add(num);
      }
      num++;
    }
  }

  private static boolean isPrimeNumber(int number)
  {
    if (number % 2 == 0)
    {
      return false;
    }

    final int limit = (int) Math.sqrt(number);
    for (int each : primeNumberList)
    {
      if (number % each == 0)
      {
        return false;
      }
      if (each > limit)
      {
        break;
      }
    }
    return true;
  }
}