import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  static int[] array1 = new int[2001];

  static int[] array2 = new int[4001];

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    init();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      int num = Integer.valueOf(input.readLine());

      System.out.println(array2[num]);
    }

  }

  private static void init()
  {

    for (int i = 0; i <= 1000; i++)
    {
      for (int j = 0; j <= 1000; j++)
      {
        array1[i + j]++;
      }
    }

    for (int i = 0; i <= 2000; i++)
    {
      for (int j = 0; j <= 2000; j++)
      {
        array2[i + j] += array1[i] * array1[j];
      }
    }
  }
}