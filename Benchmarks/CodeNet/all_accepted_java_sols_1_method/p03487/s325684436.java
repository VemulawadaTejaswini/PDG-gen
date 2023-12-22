import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    int min = 0;

    HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

    String[] ls = r.readLine().split("[\\s]+");

    for(String s : ls)
    {
      int x = Integer.parseInt(s);
      if(x > 100000)
      {
        min++;
      }
      else
      {
        a.put(x, (a.get(x) == null ? 0 : a.get(x)) + 1);
      }
    }

    for(Entry<Integer, Integer> e : a.entrySet())
    {
      int x = e.getKey();
      int card = e.getValue();

      if(x <= card)
      {
        min += card - x;
      }
      else
      {
        min += card;
      }
    }

    System.out.println(min);

  }

}