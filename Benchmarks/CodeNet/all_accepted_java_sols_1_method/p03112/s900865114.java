import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    PrintWriter out = new PrintWriter(System.out);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");

    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);
    int q = Integer.parseInt(sl[2]);

    TreeSet<Long> ts = new TreeSet<>();
    TreeSet<Long> tt = new TreeSet<>();

    ts.add(-10000000000000L);
    tt.add(-10000000000001L);
    ts.add(-10000000000002L);

    ts.add(10000000000000L);
    tt.add(10000000000001L);
    ts.add(10000000000002L);

    for(int i = 1; i <= a; i++)
    {
      ts.add(Long.parseLong(r.readLine()));
    }
    for(int i = 1; i <= b; i++)
    {
      tt.add(Long.parseLong(r.readLine()));
    }
    for(int i = 1; i <= q; i++)
    {
      long x = Long.parseLong(r.readLine());

      long v1 = ts.floor(x);
      long v2 = tt.floor(v1);
      long z = x - v2;

      v1 = ts.floor(x);
      v2 = tt.ceiling(v1);
      z = Math.min(z, (x - v1) + (v2 - v1));

      v1 = ts.ceiling(x);
      v2 = tt.floor(v1);
      z = Math.min(z, (v1 - x) + (v1 - v2));

      v1 = ts.ceiling(x);
      v2 = tt.ceiling(v1);
      z = Math.min(z, v2 - x);

      v1 = tt.floor(x);
      v2 = ts.floor(v1);
      z = Math.min(z, x - v2);

      v1 = tt.floor(x);
      v2 = ts.ceiling(v1);
      z = Math.min(z, (x - v1) + (v2 - v1));

      v1 = tt.ceiling(x);
      v2 = ts.floor(v1);
      z = Math.min(z, (v1 - x) + (v1 - v2));

      v1 = tt.ceiling(x);
      v2 = ts.ceiling(v1);
      z = Math.min(z, v2 - x);

      out.println(z);
    }
    out.flush();
  }

}