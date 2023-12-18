
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    String[] sl = r.readLine().split("[\\s]+");
    int[] p = new int[100009];
    int[] s = new int[100009];

    p[0] = 0;
    for (int i = 1; i <= n; i++)
    {
      p[i] = Integer.parseInt(sl[i - 1]);
    }
    p[n + 1] = 0;

    s[0] = 0;
    for (int i = 1; i <= n + 1; i++)
    {
      s[i] = s[i - 1] + Math.abs(p[i] - p[i - 1]);
    }

    for (int i = 1; i <= n; i++)
    {
      System.out.println(s[i - 1] + Math.abs(p[i + 1] - p[i - 1]) + s[n + 1] - s[i + 1]);
    }

  }

}
