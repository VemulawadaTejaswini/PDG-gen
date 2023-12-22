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

    int in_N;

    int cnt;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);


      /*----------------
       * 計算
       *----------------*/
      ans = 0;
      for(cnt=1; cnt<=in_N; cnt+=2)
      {
        if(8 == getFactorNum(cnt))
        {
          ans++;
        }
      }

      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

  public static int getFactorNum
  (
    int num
  )
  {
    int ret;
    int cnt;


    ret = 0;
    for(cnt=1; cnt<=num; cnt++)
    {
      if(num % cnt == 0)
      {
        ret++;
      }
    }

    return ret;
  }
}
