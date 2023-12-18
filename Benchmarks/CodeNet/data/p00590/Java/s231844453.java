import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
    Scanner take = new Scanner(System.in);
    while(take.hasNext())
    {
      int p = take.nextInt();
      int np = 0;
        int  j = p-1;
        int i = 2;
        while(i<p)
        {
          if(prime(i) && prime(j))
          {
            np++;
          }
          i++;
          j--;
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