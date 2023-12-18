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
    int n = Integer.parseInt(sl[0]);

    long a[] = new long[n];
    long v[] = new long[n];
    
    sl = r.readLine().split(" ");
    for(int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
    }
    
    long sig = 1;
    long v0 = 0;
    for(int i = 0; i < n; i++)
    {
      v0 += a[i] * sig;
      sig = - sig;
    }
    v[0] = v0;
    
    for(int i = 1; i < n; i++)
    {
      v[i] = (a[i - 1] - v[i - 1] / 2) * 2;
    }
    
    for(int i = 0; i < n; i++)
    {
      System.out.println(v[i]);
    }
    
  }

}