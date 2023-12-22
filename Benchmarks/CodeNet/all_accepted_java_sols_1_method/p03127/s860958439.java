import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  static long t[];
  static long l[];
  static long h[];

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);

    int a[] = new int[n];
    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      a[i] = Integer.parseInt(sl[i]);
    }

    for(int i = 0; i < n - 1; i++)
    {
      int x = a[i];
      int y = a[i + 1];
      while(y > 0)
      {
        int t = y;
        y = x % y;
        x = t;
      }
      a[i + 1] = x;
    }

    System.out.println(a[n - 1]);
  }

}