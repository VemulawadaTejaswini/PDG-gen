import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
  public static long d[] = new long[123456];
  public static HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();
  public static HashMap<Integer, ArrayList<Long>> hd = new HashMap<>();

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s = r.readLine();

    boolean f = true;
    int z = 0;
    int w = 0;
    for(int i = 0; i < s.length(); i++)
    {
      char c = s.charAt(i);
      if(i == 0)
      {
        f = c == 'A';
      }
      if(2 <= i && i <= s.length() - 2 && c == 'C')
      {
        z++;
      }
      if(!('a' <= c && c <= 'z'))
      {
        w++;
      }
    }
    
    System.out.println(f && z == 1 && w == 2? "AC" : "WA");

  }

}