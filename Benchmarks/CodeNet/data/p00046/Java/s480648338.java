import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AOJ_0046
{
  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Float> inputList = new ArrayList<>();

    while (input.ready())
    {
      inputList.add(Float.parseFloat(input.readLine()));
    }
    final float ans = getDiffHight(inputList);
    System.out.println(ans);
  }

  private static float getDiffHight(ArrayList<Float> list)
  {
    float maxHight = Float.MIN_VALUE;
    float minHight = Float.MAX_VALUE;

    for (Float each : list)
    {
      if (each > maxHight)
      {
        maxHight = each;
      }
      else if (each < minHight)
      {
        minHight = each;
      }
    }
    return maxHight - minHight;
  }
}