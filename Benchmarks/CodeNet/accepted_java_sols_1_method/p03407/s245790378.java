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
    int in_C;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_A = Integer.parseInt(in_str_split[0]);
      in_B = Integer.parseInt(in_str_split[1]);
      in_C = Integer.parseInt(in_str_split[2]);


      /*----------------
       * 計算
       *----------------*/
      if( in_C <= (in_A + in_B) )
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }

    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}
