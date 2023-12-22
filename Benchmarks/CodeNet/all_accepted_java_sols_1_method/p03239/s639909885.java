import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int in_N;
    int in_T;

    int c;
    int t;
    int cnt;
    int ans;

    ans = 9999;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_N         = Integer.parseInt(in_str_split[0]);
      in_T         = Integer.parseInt(in_str_split[1]);

      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");
        c            = Integer.parseInt(in_str_split[0]);
        t            = Integer.parseInt(in_str_split[1]);

        if(t <= in_T)
        {
          if(c < ans)
          {
            ans = c;
          }
        }
      }

      /*----------------
       * 計算
       *----------------*/
      if(9999 == ans)
      {
        System.out.println("TLE");
      }
      else
      {
        System.out.println(String.valueOf(ans));
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
