import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    String[] sl = r.readLine().split("[\\s]+");
    int[] x = new int[n];
    int[] st = new int[n];
    for(int i = 0; i < n; i++)
    {
      x[i] = Integer.parseInt(sl[i]);
      st[i] = x[i];
    }
    
    Arrays.sort(st);

    int a = st[(n - 1) / 2];
    int b = st[n / 2];
    
    for(int i = 0; i < n; i++)
    {
      System.out.println(x[i] <= a ? b : a);
    }

  }

}
