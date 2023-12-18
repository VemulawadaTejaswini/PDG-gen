import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    long M=1000000007;
    long[] a=new long[n];
    long pos=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextLong();
      a[i]=a[i]%M;
      if(a[i]>0)
       pos++;
    }
    
    Arrays.sort(a);
    //int v=0,i=n-1,j=0;
    long ans=1;
    if(k%2==0)
    {
      int v=0,i=n-1,j=0;
      while(k>0)
     {
       if(k==1)
       {
        ans=(ans*a[i])%M;
        k--;
       }
       else
       {
        long v1=((a[i]%M)*(a[i-1]%M))%M;
        long v2=((a[j]%M)*(a[j+1]%M))%M;
        if(v1>v2)
        {
          ans=(ans*v1)%M;
          i=i-2;
          k-=2;
        }
        else
        {
          ans=(ans*v2)%M;
          j=j-2;
          k-=2;
        }
          
      }
        
     }
    }
    else
    {
        if(k<=pos)
        {
            long c=0;
            for(int i=n-1;c<k;i++,c++)
             ans=(ans*a[i])%M;
        }
        else
        {
            int i=n-1,v=0,j=0;
          while(k>0)
          {
            if(k==1)
            {
             ans=(ans*a[i])%M;
             k--;
            }
            else
            {
             long v1=((a[i]%M)*(a[i-1]%M))%M;
             long v2=((a[j]%M)*(a[j+1]%M))%M;
             if(v1>v2)
             {
               ans=(ans*v2)%M;
               j=j-2;
               k-=2;
             }
             else
            {
             ans=(ans*v1)%M;
             i=i-2;
             k-=2;
            }
          
        }
        
      }   
     }
    }       
    if(ans>0)
    System.out.println(ans%M);
    else
     System.out.println(M+(ans%M));
  }
}