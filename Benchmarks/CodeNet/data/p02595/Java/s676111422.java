import java.util.*;
import java.lang.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double d=sc.nextDouble();
    double x=0,y=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
      x=sc.nextDouble();
      y=sc.nextDouble();
      double val=(x*x)+(y*y)
      double ans=Math.sqrt(val);
      if(ans<=d)
        count++;
    }
    System.out.println(count);
  }
}