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

    int in_K;

    int odd;
    int even;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_K   = Integer.parseInt(in_str);

      /*----------------
       * 計算
       *----------------*/
      if(in_K % 2 == 0)
      {
        odd  = (in_K / 2);
        even = (in_K / 2);
      }
      else
      {
        odd  = (in_K / 2);
        even = (in_K / 2) + 1;
      }

      ans = odd * even;


      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
