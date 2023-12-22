import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    final int dataCount = Integer.valueOf(input.readLine());
    int[][] array = new int[dataCount][2];

    for (int i = 0; i < dataCount; i++)
    {
      String[] INPUT_STR = input.readLine().split(" ");
      array[i][0] = Integer.valueOf(INPUT_STR[0]);
      array[i][1] = Integer.valueOf(INPUT_STR[1]);
    }

    int max = -1;
    int index = -1;
    for (int i = 0; i < array.length; i++)
    {
      if (max < array[i][1])
      {
        max = array[i][1];
        index = array[i][0];
      }
      else if (max == array[i][1] && index > array[i][0])
      {
        index = array[i][0];
      }
    }
    System.out.println(index + " " + max);
  }
}

