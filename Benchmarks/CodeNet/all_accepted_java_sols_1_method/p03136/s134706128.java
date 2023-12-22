import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    
    s = r.readLine();
    sl = s.split(" ");
    int max = 0;
    int sum = 0;
    for(int i = 0; i < n; i++)
    {
      int z = Integer.parseInt(sl[i]);
      max = Math.max(z, max);
      sum += z;
    }

    System.out.println(max < (sum - max) ? "Yes" : "No");
  }


}
