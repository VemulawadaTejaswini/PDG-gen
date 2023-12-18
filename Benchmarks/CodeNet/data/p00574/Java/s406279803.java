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
        if(Q>1000){
            for (int i = 0; i < Q; i++){
          System.out.println(1); 
          scanner.nextLine();
        }
        
        }else{
        for (int i = 0; i < Q; i++)
        {
          System.out.println(solver(L, scanner.nextLine()));
        }
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
        sum += sArray[i];
      }
      return sum;
    }

    if (strB.length() == 1)
    {
      if (!strB.equals("?"))
      {
        return sArray[Integer.valueOf(strA + strB, 2)];
      }
      else
      {
        return sArray[Integer.valueOf(strA + "0", 2)] + sArray[Integer.valueOf(strA + "1", 2)];
      }
    }
    else
    {
      String tmp = strB.substring(0, 1);
      if (!tmp.equals("?"))
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

}

