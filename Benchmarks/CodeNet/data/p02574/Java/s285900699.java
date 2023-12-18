import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long a[]=new long[n];
    long min=10000000;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextLong();
      min=Math.min(min,a[i]);
    }
    int ans=0;
    for(int i=2;i*i<=min;i++)
    {
      int cnt=0;
      for(int j=0;j<n;j++)
      {
        if(a[j]%i==0)
        cnt++;
      }
      if(cnt>=n)
      {
        ans=2;
        break;
      }
      else if(cnt>1)
      {
        ans=1;
      }
    }
    if(ans==0)
    System.out.println("pairwise coprime");
    else if(ans==1)
    System.out.println("setwise coprime");
    else
    System.out.println("not coprime");
  }
}
    