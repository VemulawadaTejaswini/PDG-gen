import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  final static int BIGIN_NUM = 0;

  final static int END_NUM = 1000;

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      int num = Integer.valueOf(input.readLine());
      int ans = 0;
      for (int i = BIGIN_NUM; i <= END_NUM; i++)
      {
        if (i > num)
          break;
        for (int j = BIGIN_NUM; j <= END_NUM; j++)
        {
          if (j > num)
            break;
          for (int k = BIGIN_NUM; k <= END_NUM; k++)
          {
            if (k > num)
              break;
            for (int l = BIGIN_NUM; l <= END_NUM; l++)
            {
              if (l > num)
                break;
              if (i + j + k + l == num)
              {
                ans += 1;
              }
            }
          }
        }
      }
      System.out.println(ans);
    }

  }

}