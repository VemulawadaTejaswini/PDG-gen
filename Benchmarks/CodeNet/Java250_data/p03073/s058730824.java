import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    char[] c = in.next().toCharArray();
    char[] eq = {'0', '1'};
    int o = 0, z = 0;
    for (int i = 0; i < c.length; i++)
    {
      if (c[i] != eq[i%2]) o++;
      else z++;
    }
    int ans = (int)(Math.min(o, z));
    System.out.println(ans);
  }
}