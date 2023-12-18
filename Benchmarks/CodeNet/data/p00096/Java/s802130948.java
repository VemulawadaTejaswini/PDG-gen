import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  static int[] array1 = new int[2001];

  static int[] array2 = new int[4001];

  final static int BIGIN_NUM = 1000;

  final static int END_NUM = 0;

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

  private static int solver(int num)
  {
    int ans = 0;
    int current = 0;

    int start_i = 0;
    if (num > END_NUM)
    {
      start_i = BIGIN_NUM;
    }
    else
    {
      start_i = num;
    }
    for (int i = start_i; i >= END_NUM; i--)
    {
      current = i;
      int start_j = num - i;
      if (start_j > BIGIN_NUM)
      {
        start_j = BIGIN_NUM;
      }
      for (int j = start_j; j >= END_NUM; j--)
      {
        current = i + j;
        int start_k = num - current;
        if (start_k > BIGIN_NUM)
        {
          start_k = BIGIN_NUM;
        }
        for (int k = start_k; k >= END_NUM; k--)
        {
          current = i + j + k;
          int start_l = num - current;
          if (start_l > BIGIN_NUM)
          {
            start_l = BIGIN_NUM;
          }
          for (int l = start_l; l >= END_NUM; l--)
          {
            // ?????????????????????????§°??§???????????????????????§????????????????????§?¨??????????????????£??????????????????
            System.out.println(i + " " + j + " " + k + " " + l);
            current = i + j + k + l;
            if (current == num)
            {
              ans += 1;
              break;
            }
          }
        }
      }
    }
    return ans;
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

    array1[0] = 1;

    for (int i = 0; i <= 2000; i++)
    {
      for (int j = 0; j <= 2000; j++)
      {
        array2[i + j] += array1[i] * array1[j];
      }
    }
    array2[0] = 1;
  }
}