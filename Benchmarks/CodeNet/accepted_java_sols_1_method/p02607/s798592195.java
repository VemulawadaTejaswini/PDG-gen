import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n,a,res=0;
    
   
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
      a=s.nextInt();
      if(a%2!=0 && i%2!=0)
      {
        res++;
      }
    }
    System.out.println(res);
  }
}
      
      