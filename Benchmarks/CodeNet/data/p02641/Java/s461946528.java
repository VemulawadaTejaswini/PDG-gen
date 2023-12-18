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
      ArrayList<Integer> al=new ArrayList<Integer>();
      int diff=100;
      int min=0;
      for(int i=0;i<n;i++)
      {
        int v=sc.nextInt();
        al.add(v);
        if(Math.abs(k-v)<diff)
        {
         diff=Math.abs(k-v);
          min=v;
        }
      }
      boolean f=true;
      while(f)
      {
        if(!al.contains(min-1))
        {
          ans=min-1;
          f=false;
        }
        if(!al.contains(min+1))
        {
          ans=min+1;
          f=false;
        }
        if(f==true)
          min++;   
      }
      System.out.println(ans);
    }
  }
}