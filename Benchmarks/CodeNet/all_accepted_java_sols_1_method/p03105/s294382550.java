import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
    int c = Integer.parseInt(sl[2]);

    out.println(Math.min(b / a, c));
    out.flush();
  }

}