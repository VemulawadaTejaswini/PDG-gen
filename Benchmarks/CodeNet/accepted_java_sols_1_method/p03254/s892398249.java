import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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

    int   in_N;
    int   in_x;
    int[] in_a;

    int cnt;
    int tmp;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_N         = Integer.parseInt(in_str_split[0]);
      in_x         = Integer.parseInt(in_str_split[1]);

      in_a         = new int[in_N];
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_a[cnt] = Integer.parseInt(in_str_split[cnt]);
      }


      /*----------------
       * 計算
       *----------------*/
      ans = 0;
      tmp = 0;

      Arrays.sort(in_a);

      for(cnt=0; cnt<in_N; cnt++)
      {
        tmp += in_a[cnt];

        if(tmp <= in_x)
        {
          ans++;
        }
        else
        {
          break;
        }
      }

      if((cnt == in_N) && (tmp < in_x))
      {
        ans--;
      }


      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
