import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n,l,r,res=0;
    
    l=s.nextInt();
    r=s.nextInt();
    n=s.nextInt();
    for(int i=l;i<=r;i++)
    {
      if(i%n==0)
      {
        res++;
      }
    }
    System.out.println(res);
  }
}
      
      