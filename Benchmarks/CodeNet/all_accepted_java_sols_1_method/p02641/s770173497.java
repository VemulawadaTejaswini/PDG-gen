import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=sc.nextInt();
    if(n==0)
       System.out.println(k);
    else
    {
      HashSet<Integer> s=new HashSet<Integer>();
      for(int i=0;i<n;i++)
        s.add(sc.nextInt());
      if(!s.contains(k))
      {
        System.out.println(k);
        return;
      }
      for(int d=1;true;d++)
      {
        if(!s.contains(k-d))
        {
          System.out.println(k-d);
          return;
        }
        if(!s.contains(k+d))
        {
          System.out.println(k+d);
          return;
        }
      }
    }
  }
}
