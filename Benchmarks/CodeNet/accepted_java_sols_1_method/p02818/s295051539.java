import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    long a=in.nextLong();
    long b=in.nextLong();
    long k=in.nextLong();
    if(a+b<=k)
    {
      System.out.println("0 0");
    }
    else if(a>=k)
    {
      System.out.println((a-k)+" "+b);
    }
    else
    {
      System.out.println("0 "+(b-(k-a)));
    }
  }
}