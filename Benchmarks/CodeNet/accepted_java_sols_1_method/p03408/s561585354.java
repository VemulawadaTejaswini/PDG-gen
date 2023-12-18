import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main
{

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;

    int                      in_N;
    int                      in_M;
    HashMap<String, Integer> input;

    int     cnt;
    Integer value;
    int     ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      input = new HashMap<String, Integer>();

      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str = new String(in_stream.readLine());

        if(input.containsKey(in_str))
        {
          value = input.get(in_str);
          value++;
          input.put(in_str, value);
        }
        else
        {
          input.put(in_str, 1);
        }
      }

      in_str = new String(in_stream.readLine());
      in_M   = Integer.parseInt(in_str);

      for(cnt=0; cnt<in_M; cnt++)
      {
        in_str = new String(in_stream.readLine());

        if(input.containsKey(in_str))
        {
          value = input.get(in_str);
          value--;
          input.put(in_str, value);
        }
        else
        {
          input.put(in_str, -1);
        }
      }


      /*----------------
       * 計算
       *----------------*/
      ans = 0;

      for(String key : input.keySet())
      {
        value = input.get(key);
        if(ans < value)
        {
          ans = value;
        }
      }

      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
