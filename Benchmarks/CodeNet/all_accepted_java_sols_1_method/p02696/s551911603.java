import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long n=sc.nextLong();
    long d=0,c=n;
   c=Math.min(b-1,n);
    d=(a*c/b) - a*(c/b);
      System.out.println(d);
     
  }
}
    