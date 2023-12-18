import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String sl[];

    sl = r.readLine().split(" ");
    long a = Long.parseLong(sl[0]);
    long b = Long.parseLong(sl[1]);
    
    long v = 3000;
    long d = Math.min(a + 4050, b);
    for(long i = a; i <= d; i++)
    {
      for(long j = i + 1; j <= d; j++)
      {
        v = Math.min(v, ((i % 2019) * (j % 2019)) % 2019);
      }
    }
    
    System.out.println(v);
    
  }

}
