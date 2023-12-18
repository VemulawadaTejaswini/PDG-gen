import java.util.Scanner;

public class Main
{

  //private static int[] sArray;
  private static String STR_S;
  private static final String ZERO = "0";
  private static final String ONE = "1";
  private static final String Q = "?";

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        String[] tmp = scanner.nextLine().split(" ");
        final int L = Integer.valueOf(tmp[0]);
        final int Q = Integer.valueOf(tmp[1]);
        STR_S = scanner.nextLine();
        /*
        sArray = new int[STR_S.length()];
        for (int i = 0; i < sArray.length; i++)
        {
          sArray[i] = Integer.valueOf(STR_S.substring(i, i + 1));
        }
        */

        for (int i = 0; i < Q; i++)
        {
          System.out.println(solver(L, scanner.nextLine()));
        }
      }
    }
  }

  private static int solver(int L, String data)
  {
    if (0 > data.indexOf('?'))
    {
      return getValue(data);
    }

    return solver2(new StringBuffer(), data);
  }

  private static int solver2(StringBuffer strA, String strB)
  {
    int sum = 0;

    if ((0 > strB.indexOf('1')) && (0 > strB.indexOf('0')))
    {
      final int START = Integer.valueOf(strA.append(strB.replace('?', '0')).toString(), 2);
      final int END = Integer.valueOf(strA.append(strB.replace('?', '1')).toString(), 2);
      for (int i = START; i <= END; i++)
      {
        sum += getValue(i);
      }
      return sum;
    }

    if (strB.length() == 1)
    {
      if (!strB.equals(Q))
      {
        return getValue(strA.append(strB).toString());
      }
      else
      {
        return getValue(strA.append(ZERO).toString())+ getValue(strA.append(ONE).toString());
      }
    }
    else
    {
      String tmp = strB.substring(0, 1);
      String tmp2 = strB.substring(1);
      if (!tmp.equals(Q))
      {
        return solver2(strA.append(tmp), tmp2);
      }
      else
      {
        sum += solver2(strA.append(ZERO), tmp2);
        sum += solver2(strA.append(ONE), tmp2);
      }
    }

    return sum;
  }

  private static int getValue(String indexBinString)
  {
    int indexNum = Integer.valueOf(indexBinString, 2);
    return Integer.parseInt(STR_S.substring(indexNum, indexNum + 1));
  }

  private static int getValue(int indexNum)
  {
    return Integer.parseInt(STR_S.substring(indexNum, indexNum + 1));
  }
}

