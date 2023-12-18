import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    int t=0;
    long p=100;
    while(a>p)
    {
      p=p+p/100;
      t++;
    }
      System.out.println(t);
     
  }
}