import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());

    Set<Integer> set = new HashSet<Integer>();

    for(int i = 0; i < n; i++)
    {
      set.add(Integer.parseInt(r.readLine()));
    }

    System.out.println(set.size());

  }

}
