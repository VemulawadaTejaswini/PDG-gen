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
        final int L = Integer.valueOf(tmp[0]);
        final int Q = Integer.valueOf(tmp[1]);
        final String STR_S = scanner.nextLine();
        sArray = new int[STR_S.length()];
        for (int i = 0; i < sArray.length; i++)
        {
          sArray[i] = Integer.valueOf(STR_S.substring(i, i + 1));
        }

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
    return solver2(L, data);
  }

  private static int solver2(int L, String str)
  {
    int sum = 0;
    final int MIN_NUM = Integer.valueOf(str.replace('?','0'),2);
    final int MAX_NUM = Integer.valueOf(str.replace('?','1'),2);;

    for (int i = MIN_NUM; i <= MAX_NUM; i++)
    {
      if (isMatch(i, str))
      {
        sum += sArray[i];
      }
    }

    return sum;
  }

  private static boolean isMatch(int numDec, String strBin)
  {
    String bin = LPAD(String.format(Integer.toBinaryString(numDec)), '0', strBin.length());
    for (int i = 0; i < bin.length(); i++)
    {
      if (!strBin.substring(i, i + 1).equals("?"))
      {
        if (!strBin.substring(i, i + 1).equals(bin.substring(i, i + 1)))
        {
          return false;
        }
      }
    }
    return true;
  }

  private static String LPAD(String str, char c, int length)
  {
    final int count = Math.max(0, length - str.length());
    String padStr = "";
    for (int i = 0; i < count; i++)
    {
      padStr += c;
    }
    return padStr + str;
  }

}

