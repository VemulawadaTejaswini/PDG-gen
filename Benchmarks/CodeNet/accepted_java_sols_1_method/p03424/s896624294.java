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

    int      in_N;
    String[] in_S;

    int     cnt;
    boolean is_four;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_S   = in_str.split(" ");

      is_four = false;
      for(cnt=0; cnt<in_N; cnt++)
      {
        if(in_S[cnt].equals("Y"))
        {
          is_four = true;
          break;
        }
      }

      if(is_four)
      {
        System.out.println("Four");
      }
      else
      {
        System.out.println("Three");
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
