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
    int d = Integer.parseInt(sl[0]);
    int x = Integer.parseInt(sl[1]);

    for(int i = 0; i < n; i++)
    {
      int z = Integer.parseInt(r.readLine());
      for(int j = 0; j < d; j += z)
      {
        x++;
      }
    }

    System.out.println(x);

  }

}
