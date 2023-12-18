import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n;
    n=in.nextInt();
    int ac=0,wa=0,tle=0,re=0;
    for(int i=1;i<=n;i++)
    {
      String s=in.next();
      if(s=="AC")
      {
        ac++;
      }
      else if(s=="TLE")
      {
        tle++;
      }
      else if(s=="WA")
      {
        wa++;
      }
      else
      {
        re++;
      }
    }
      System.out.println("AC * "+ac);
      System.out.println("TLE * "+tle);
      System.out.println("RE * "+re);
      System.out.println("WA * "+wa);
  }
}
    