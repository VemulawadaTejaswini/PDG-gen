import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import static java.lang.System.exit;

public class Main
{
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int n = Integer.parseInt(sl[0]);
    int k = Integer.parseInt(sl[1]);
  
    if (k == 0)
    {
      long ln = n;
      System.out.println(ln * ln);
      System.exit(0);
    }
    
    long ans = 0;
    for(int b = k + 1; b <= n; b++)
    {
      int t = n / b;
      ans += t * (b - k);
      int z = n - t * b - k + 1;
      if (z > 0)
      {
        ans += z;
      }
    }
    System.out.println(ans);
  }
    
}
