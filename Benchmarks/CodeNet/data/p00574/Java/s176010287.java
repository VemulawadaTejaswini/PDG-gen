import java.util.Scanner;

public class Main
{

  private static String STR_S;

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        String[] tmp = scanner.nextLine().split(" ");
        final int Q = Integer.valueOf(tmp[1]);
        tmp = null;
        STR_S = scanner.nextLine();

        for (int i = 0; i < Q; i++)
        {
          System.out.println(solver(scanner.nextLine()));
        }
      }
    }
  }

  private static int solver(String data)
  {
    if (0 > data.indexOf('?'))
    {
      return getValue(data);
    }

    return solver2("", data);
  }

  private static int solver2(String strA, String strB)
  {
    int sum = 0;

    if ((0 > strB.indexOf('1')) && (0 > strB.indexOf('0')))
    {
      final int START = Integer.valueOf(strA + strB.replace('?', '0'), 2);
      final int END = Integer.valueOf(strA + strB.replace('?', '1'), 2);
      for (int i = START; i <= END; i++)
      {
        sum += getValue(i);
      }
      return sum;
    }

    if (strB.length() == 1)
    {
      if (strB.equals("0") || strB.equals("1"))
      {
        return getValue(strA + strB);
      }
      else
      {
        return getValue(strA + "0") + getValue(strA + "1");
      }
    }
    else
    {
      String tmp = strB.substring(0, 1);
      if (tmp.equals("0") || tmp.equals("1"))
      {
        return solver2(strA + tmp, strB.substring(1));
      }
      else
      {
        sum += solver2(strA + "0", strB.substring(1));
        sum += solver2(strA + "1", strB.substring(1));
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

