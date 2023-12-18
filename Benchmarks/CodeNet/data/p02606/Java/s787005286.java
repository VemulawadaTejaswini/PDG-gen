import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int l=in.nextInt();
    int D=in.nextInt();
    d=r%d;
    if(r+d>l)
    {
      System.out.println("0");
    }
    else
    {
      int c=0;
      r=r+d;
      int a=d;
      while(r<=l)
      {
       c++;
        r=r+a;
      }
      System.out.println(c);
    }
  }
}