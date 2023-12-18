import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
  public static void main(String[] args) throws NumberFormatException, IOException
  {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    final String[] HEADER_STR = input.readLine().split(" ");

    final int MEMBER_COUNT = Integer.valueOf(HEADER_STR[0]);

    final int EVENT_COUNT = Integer.valueOf(HEADER_STR[1]);

    int[][] array = new int[MEMBER_COUNT][2];
    for (int i = 0; i < array.length; i++)
    {
      array[i][0] = i + 1;
    }

    int index = -1;
    int value = -1;

    int currentMaxIndex = MEMBER_COUNT + 1;
    int currentMax = -1;

    for (int i = 0; i < EVENT_COUNT; i++)
    {
      String[] INPUT_STR = input.readLine().split(" ");
      index = Integer.valueOf(INPUT_STR[0]);
      value = Integer.valueOf(INPUT_STR[1]);

      array[index - 1][0] = index;
      array[index - 1][1] += value;

      if (0 <= value)
      {
        if (currentMaxIndex == index)
        {
          currentMax = array[index - 1][1];
          systemOutput(array[index - 1][0], array[index - 1][1]);
          continue;
        }
        else if (currentMax > array[index - 1][1])
        {
          systemOutput(currentMaxIndex, currentMax);
          continue;
        }
        else if (currentMax < array[index - 1][1])
        {
          currentMaxIndex = index;
          currentMax = array[index - 1][1];
          systemOutput(currentMaxIndex, currentMax);
          continue;
        }
      }
      else
      {
        if (currentMaxIndex != index)
        {
          if (currentMax == array[index - 1][1] && currentMaxIndex > index)
          {
            currentMaxIndex = index;
            systemOutput(currentMaxIndex, currentMax);
            continue;
          }
          systemOutput(currentMaxIndex, currentMax);
          continue;
        }
      }

      Arrays.sort(array, new Comparator<int[]>() {
        public int compare(int[] o1, int[] o2)
        {
          if (o1[1] == o2[1])
          {
            return o1[0] - o2[0];
          }
          else
          {
            return o2[1] - o1[1];
          }
        }
      });
      currentMaxIndex = array[0][0];
      currentMax = array[0][1];
      Arrays.sort(array, new Comparator<int[]>() {
        public int compare(int[] o1, int[] o2)
        {
          return o1[0] - o2[0];
        }
      });
      systemOutput(currentMaxIndex, currentMax);
    }
  }

  private static void systemOutput(int menberNumber, int fishCount)
  {
    System.out.println(menberNumber + " " + fishCount);
  }
}

