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

    int in_X1;
    int in_Y1;
    int in_X2;
    int in_Y2;

    int X3;
    int Y3;
    int X4;
    int Y4;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_X1        = Integer.parseInt(in_str_split[0]);
      in_Y1        = Integer.parseInt(in_str_split[1]);
      in_X2        = Integer.parseInt(in_str_split[2]);
      in_Y2        = Integer.parseInt(in_str_split[3]);


      /*----------------
       * 計算
       *----------------*/
      X3 = in_X2 - (in_Y2 - in_Y1);
      Y3 = in_Y2 + (in_X2 - in_X1);
      X4 = in_X1 - (in_Y2 - in_Y1);
      Y4 = in_Y1 + (in_X2 - in_X1);

      System.out.println(String.format("%d %d %d %d", X3, Y3, X4, Y4));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
