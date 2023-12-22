import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n%1000==0)
    {
      System.out.println("0");
    }
    else
    {
      int a=(n/1000)+1;
      System.out.println((a*1000)-n);
    }
  }
}