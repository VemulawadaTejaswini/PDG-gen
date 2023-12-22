import java.util.*;

public class Main
{
  static long oo = (long)1e18;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int w = in.nextInt();
    long[] W = new long[n];
    int[] V = new int[n];
    for (int i = 0; i < n; i++)
    {
      W[i] = in.nextLong();
      V[i] = in.nextInt();
    }
    
    long[] min = new long[1000*100+1];
    Arrays.fill(min, oo);
    min[0] = 0;
    for (int i = 0; i < n; i++)
      for (int v = 1000*100-V[i]; v >= 0; v--)
          min[v+V[i]] = Math.min(min[v+V[i]], W[i]+min[v]);
    
    int best = 1000*100;
    for (; best >= 0; best--)
      if (min[best] <= w)
        break;
    System.out.println(best);        
    in.close();
  }
}