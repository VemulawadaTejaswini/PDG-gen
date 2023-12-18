import java.util.Scanner;

public class Main
{

  private static int[] sArray;

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        String[] tmp = scanner.nextLine().split(" ");
        final int L = Integer.parseInt(tmp[0]);
        final int Q = Integer.parseInt(tmp[1]);
        final String STR_S = scanner.nextLine();
        sArray = new int[STR_S.length()];
        for (int i = 0; i < sArray.length; i++)
        {
          sArray[i] = Integer.parseInt(STR_S.substring(i, i + 1));
        }

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
      return sArray[Integer.valueOf(data, 2)];
    }

    if ((0 > data.indexOf('1')) && (0 > data.indexOf('0')))
    {
      int sum = 0;
      for (int i : sArray)
      {
        sum += i;
      }
      return sum;
    }
    return solver2(data);
  }

  private static int solver2(String str)
  {
    int count = 0;
    for (int i = 0; i < str.length(); i++)
    {
      if (str.substring(i, i + 1).equals("?"))
      {
        count++;
      }
    }

    int sum = 0;
    final int MIN_NUM = 0;
    final int MAX_NUM = Integer.parseInt(LPAD("", '1', count), 2);

    for (int i = MIN_NUM; i <= MAX_NUM; i++)
    {
      sum += sArray[Integer.parseInt(
          makeBinStr(str, LPAD(String.format(Integer.toBinaryString(i)), '0', count)), 2)];
    }

    return sum;
  }

  private static String makeBinStr(String mainBin, String subBin)
  {
    StringBuffer ansStringBuf = new StringBuffer(mainBin.length());

    int subBinIndex = 0;

    for (int i = 0; i < mainBin.length(); i++)
    {
      String tmp = mainBin.substring(i, i + 1);
      if (tmp.equals("?"))
      {
        ansStringBuf.append(subBin.substring(subBinIndex, subBinIndex + 1));
        subBinIndex++;
      }
      else
      {
        ansStringBuf.append(tmp);
      }
    }
    return ansStringBuf.toString();
  }

  private static String LPAD(String str, char c, int length)
  {
    final int count = Math.max(0, length - str.length());
    StringBuffer ansStringBuf = new StringBuffer(length);
    for (int i = 0; i < count; i++)
    {
      ansStringBuf.append(c);
    }
    ansStringBuf.append(str);
    return ansStringBuf.toString();
  }

}

