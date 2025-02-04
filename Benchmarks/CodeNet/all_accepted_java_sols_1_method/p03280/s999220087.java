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

    int in_A;
    int in_B;

    int   ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_A         = Integer.parseInt(in_str_split[0]);
      in_B         = Integer.parseInt(in_str_split[1]);

      /*----------------
       * 計算
       *----------------*/
      ans = (in_A * in_B) - in_A - in_B + 1;

      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
