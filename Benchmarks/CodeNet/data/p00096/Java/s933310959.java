import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  final static int BIGIN_NUM = 1000;

  final static int END_NUM = 0;

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      int num = Integer.valueOf(input.readLine());
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
          int start_k = num - i - j;
          if (start_k > BIGIN_NUM)
          {
            start_k = BIGIN_NUM;
          }
          for (int k = start_k; k >= END_NUM; k--)
          {
            current = i + j + k;
            int start_l = num - i - j - k;
            if (start_l > BIGIN_NUM)
            {
              start_l = BIGIN_NUM;
            }
            for (int l = start_l; l >= END_NUM; l--)
            {
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
      System.out.println(ans);
    }

  }

}