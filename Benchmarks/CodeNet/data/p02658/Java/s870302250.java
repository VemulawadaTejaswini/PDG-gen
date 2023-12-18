import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long f=1; int g=0;
    while(n-->0)
    {
      long b=sc.nextLong();
      f=f*b;
      if(f> 1000000000000000000)
      {
        g=1;break;
      }
    }
    if(g==1) System.out.print(-1);
    else
    System.out.print(f);
  }
}