import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int M=in.nextInt();
    int a[]=new int [M];
    int i;long p=0;
    for(i=0;i<M;i++)
    {
      a[i]=in.nextInt();p=p+a[i];
    }
    if(p>N)
      System.out.println("-1");
    else
    {
      System.out.println(N-p);
    }
  }
}
    