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
    //sl = s.split(" ");

    int zeroes = 0;
    int ones = 0;
    int n = s.length();

    for(int i = 0; i < n; i++)
    {
      if(s.charAt(i) == '0')
      {
        zeroes++;
      }
      else
      {
        ones++;
      }
    }
    out.println(n - Math.abs(zeroes - ones));
    out.flush();
  }

}