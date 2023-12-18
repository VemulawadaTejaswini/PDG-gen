import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int ans=0;
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int count=0;
      for(int j=0;j<n;j++)
      {
        if(i!=j && a[j]%a[i]!=0)
          count++;
        else if(i!=j && a[j]%a[i]==0)
          break;
      }
      if(count==n-1)
        ans++;
    }
    System.out.println(ans);
  }
}