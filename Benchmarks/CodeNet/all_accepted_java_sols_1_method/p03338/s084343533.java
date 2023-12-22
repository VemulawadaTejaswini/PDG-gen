import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());
    //int v = Integer.parseInt(s);

    //String[] sl = s.split("[\\s]+");
    //int n = Integer.parseInt(sl[0]);
    //int x = Integer.parseInt(sl[1]);
    
    String s = r.readLine();
    
    int max = 0;

    for (int i = 1; i < n; i++)
    {
      String s1 = s.substring(0, i);
      String s2 = s.substring(i, n);
      int v = 0;
      for(Character c = 'a'; c <= 'z'; c++)
      {
        if(s1.contains(c.toString()) && s2.contains(c.toString()))
        {
          v++;
        }
      }
      max = Math.max(max, v);
    }

    System.out.println(max);

  }

}