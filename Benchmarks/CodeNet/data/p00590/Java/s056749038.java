import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
    Scanner take = new Scanner(System.in);
    while(take.hasNext())
    {
      int p = take.nextInt();
      int []a = new int[p];
      int np = 0;
      int i = 2;
      while(i<p)
      {
        if(prime(i))
        {
          a[i-1] = i;
        }
        i++;
      }
      for(int k = 0;k<a.length;k++)
      {
        if(a[k]!=0 & a[a.length-1-k]!=0)
        {
          np++;
        }
      }
      System.out.println(np);
    }
  }
  public static boolean prime(int i)
  {
    for(int j = 2;j<=i/2;j++)
    {
      if(i%j==0)
      {
        return false;
      }
    }
    return true;
  }
}