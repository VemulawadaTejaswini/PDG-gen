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
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);

    System.out.println(b / a * a == b ? a + b : b - a);
  }

}