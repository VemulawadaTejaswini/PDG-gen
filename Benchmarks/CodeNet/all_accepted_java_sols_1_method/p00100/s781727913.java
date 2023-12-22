import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine())
    {
      String[] input = sc.nextLine().split(" ");

      if (input.length == 1)
      {
        if (Integer.valueOf(input[0]) == 0)
        {
          break;
        }
      }

      final int dataset = Integer.valueOf(input[0]);

      Map<Long, Long> dataMap = new LinkedHashMap<>();
      for (int i = 0; i < dataset; i++)
      {
        String[] inputDataset = sc.nextLine().split(" ");
        final long empNum = Long.valueOf(inputDataset[0]);
        final long price = Long.valueOf(inputDataset[1]);
        final long count = Long.valueOf(inputDataset[2]);

        if (!dataMap.containsKey(empNum))
        {
          dataMap.put(empNum, price * count);
        }
        else
        {
          dataMap.put(empNum, dataMap.get(empNum) + (long) (price * count));
        }

      }
      Object[] keySet = dataMap.keySet().toArray();
      Object[] valueSet = dataMap.values().toArray();

      boolean zeroData = true;
      for (int j = 0; j < keySet.length; j++)
      {
        if ((long) valueSet[j] >= 1000000)
        {
          zeroData = false;
          System.out.println(keySet[j]);
        }
      }

      if (zeroData)
      {
        System.out.println("NA");
      }

    }

    sc.close();
  }
}

