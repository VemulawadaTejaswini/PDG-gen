import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    long k=sc.nextLong();
    long[] a=new long[n];
    long[] b=new long[m];
    for(int l=0;l<n;l++)
       a[l]=sc.nextLong();
    for(int l=0;l<m;l++)
       b[l]=sc.nextLong();
    int i=0,j=0;
    long ans=0;
    long time=0;
    while(i<n && j<m)
    {
     if(a[i]<=b[j])
     {
       if(time+a[i]<=k)
       {
         ans++;
         time+=a[i];
         i++;
       }
       else
       {
         i=n;j=m;break;
       }
     }
      else
      {
        if(time+b[j]<=k)
        {
          ans++;
          time=time+b[j];
          j++;
        }
        else
        {
          i=n;j=m;break;
        }
      }
    }
    if(time>=k)
      System.out.println(ans);
    else
    {
      while(i<n)
      {
        if(time+a[i]<=k)
        {
          time+=a[i];
          ans++;
          i++;
        }
        else
          break;
      }
      while(j<m)
      {
       if(time+b[j]<=k)
        {
          time+=b[j];
          ans++;
          j++;
        }
        else
          break; 
      }
      System.out.println(ans);
    }
  }
}
