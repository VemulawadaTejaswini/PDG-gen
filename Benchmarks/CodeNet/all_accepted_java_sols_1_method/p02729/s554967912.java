import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();int i,j,f=0;
    int M=in.nextInt();
    for(i=1;i<=N;i++)
    {
      for(j=i+1;j<=N;j++)
        f++;
    }
    for(i=1;i<=M;i++)
    {
      for(j=i+1;j<=M;j++)
        f++;
    }
    System.out.println(f);
  }
}
      
    