import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
  private static int in_N;
  private static int in_Y;



  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;


    int   in_N;
    int[] in_A1;
    int[] in_A2;

    int cnt;
    int cnt_sum;
    int tmp_sum;
    int ans;

    try
    {

      in_stream    = new BufferedReader(new InputStreamReader(System.in));

      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      in_A1 = new int[in_N];
      in_A2 = new int[in_N];

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      for(cnt=0; cnt<in_N; cnt++)
      {

        in_A1[cnt] = Integer.parseInt(in_str_split[cnt]);
      }

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      for(cnt=0; cnt<in_N; cnt++)
      {

        in_A2[cnt] = Integer.parseInt(in_str_split[cnt]);
      }


      ans = 0;
      for(cnt=0; cnt<in_N; cnt++)
      {
        tmp_sum = 0;
        for(cnt_sum=0; cnt_sum<=cnt; cnt_sum++)
        {
          tmp_sum += in_A1[cnt_sum];
        }
        for(cnt_sum=cnt; cnt_sum<in_N; cnt_sum++)
        {
          tmp_sum += in_A2[cnt_sum];
        }

        if(ans < tmp_sum)
        {
          ans = tmp_sum;
        }
      }

      UtilLog.ans_ln("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



}



class Data
{
  public int     m_now_N_1k;
  public int     m_now_N_5k;
  public int     m_now_N_10k;
  public int     m_now_Y;
  public boolean m_result;


  public Data()
  {
    m_now_N_1k  = 0;
    m_now_N_5k  = 0;
    m_now_N_10k = 0;
    m_now_Y     = 0;
    m_result    = false;
  }

  public Data
  (
    Data i_ref
  )
  {
    this.m_now_N_1k  = i_ref.m_now_N_1k;
    this.m_now_N_5k  = i_ref.m_now_N_5k;
    this.m_now_N_10k = i_ref.m_now_N_10k;
    this.m_now_Y     = i_ref.m_now_Y;
    this.m_result    = i_ref.m_result;
  }



  public int getN()
  {
    return m_now_N_1k + m_now_N_5k + m_now_N_10k;
  }
}



class UtilLog
{
  private static boolean is_debug_mode = false;



  public static void ans_ln
  (
    String i_message
  )
  {
    System.out.println(i_message);
  }



  public static void ans_f
  (
    String i_message
  )
  {
    System.out.printf(i_message);
  }



  public static void inf_ln
  (
    String i_message
  )
  {
    StackTraceElement[] stack;


    if(is_debug_mode)
    {
    stack = new Throwable().getStackTrace();

    System.out.println
      (
        String.format
          (
            "[inf][%s:%s():%5d]",
            stack[1].getClassName(),
            stack[1].getMethodName(),
            stack[1].getLineNumber(),
            i_message
          )
      );
    }
  }
}
