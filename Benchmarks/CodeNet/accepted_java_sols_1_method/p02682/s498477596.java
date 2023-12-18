import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int k=sc.nextInt();
    int ans=0;
    if(k<a)
    {
      ans=k;
      k=0;
    }
    else
    {
      ans+=a;
      k-=a;
    }
    if(k<b)
    {
      k=0;
    }
    else
    {
      k-=b;
    }
    if(k<c)
    {
      ans-=k;
      k=0;
    }
    else
    {
      ans-=c;
    }
    System.out.println(ans);
  }
}