import java.io.BufferedReader;
import java.io.InputStreamReader;



@SuppressWarnings({"javadoc"})
public class Test02
{

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;

    String        in_T;

    int  cnt;
    int  num;
    char before;
    char now;

    StringBuilder ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_T = new String(in_stream.readLine());


      /*----------------
       * 計算
       *----------------*/
      num = in_T.length();
      ans = new StringBuilder();

      /* 1文字目 */
      before = in_T.charAt(0);
      if('?' == before)
      {
        before = 'P';
      }
      else
      {
        if( (1 == num) || ('P' == in_T.charAt(1)) )
        {
          before = 'D';
        }
      }
      ans.append(before);

      /* 2文字目以降 */
      for(cnt=1; cnt<num; cnt++)
      {
        now = in_T.charAt(cnt);

        if('?' == now)
        {
          if('P' == before)
          {
            before = 'D';
          }
          else
          {
            if( (cnt == (num-1)) || ('P' == in_T.charAt(cnt+1)) )
            {
              before = 'D';
            }
            else
            {
              before = 'P';
            }
          }
        }
        else
        {
          before = now;
        }

        ans.append(before);
      }

      System.out.println( ans.toString() );
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



}



