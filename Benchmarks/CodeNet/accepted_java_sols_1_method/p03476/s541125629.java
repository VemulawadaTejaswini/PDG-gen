import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int q = Integer.parseInt(r.readLine());
    int[] left = new int[114514];
    int[] right = new int[114514];
    boolean[] furui = new boolean[114514];
    Arrays.fill(furui, true);
    int[] nem = new int[114514];

    for(int i = 0; i < q; i++)
    {
      String[] sl = r.readLine().split("[\\s]+");
      left[i] = Integer.parseInt(sl[0]);
      right[i] = Integer.parseInt(sl[1]);
    }

    furui[0] = furui[1] = false;
    for(int i = 2; i < 114514; i++)
    {
      if(furui[i])
      {
        for(int j = i * 2; j < 114514; j += i)
        {
          furui[j] = false;
        }
      }
    }


    int nemui = 0;
    for(int i = 0; i < 114514; i++)
    {
      if(furui[i] && furui[(i + 1) / 2])
      {
        nemui++;
      }
      nem[i] = nemui;
    }

    for(int i = 0; i < q; i++)
    {
      System.out.println(nem[right[i]] - nem[left[i] - 1]);
    }
  }

}
