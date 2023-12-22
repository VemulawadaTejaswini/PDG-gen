import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);
    int x = Integer.parseInt(sl[2]);
    HashSet<Integer> hs = new HashSet<>();
    s = r.readLine();
    sl = s.split("[\\s]+");
    for(int i = 0; i < m; i++)
    {
      hs.add(Integer.parseInt(sl[i]));
    }
    //System.out.println(hs);

    int a = 0;
    for(int i = 0; i <= x; i++)
    {
      if(hs.contains(i))
      {
        a++;
      }
    }

    int b = 0;
    for(int i = x; i <= n; i++)
    {
      if(hs.contains(i))
      {
        b++;
      }
    }


    System.out.println(Math.min(a, b));

  }

}
