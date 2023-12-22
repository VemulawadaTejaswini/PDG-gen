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

    int   in_N;
    int   in_D;
    int   in_X;
    int[] in_A;

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

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_D         = Integer.parseInt(in_str_split[0]);
      in_X         = Integer.parseInt(in_str_split[1]);


      in_A = new int[in_N];
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str    = new String(in_stream.readLine());
        in_A[cnt] = Integer.parseInt(in_str);
      }


      /*----------------
       * 計算
       *----------------*/
      ans = 0;
      for(cnt=0; cnt<in_N; cnt++)
      {
        ans++;
        ans += (in_D - 1) / in_A[cnt];
      }

      ans += in_X;

      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
