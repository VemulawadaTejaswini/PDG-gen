import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    long ar[]=new long[n];
    for(int i=0;i<n;i++)
    ar[i]=in.nextLong();
    int min=n-k;
    min=Math.max(0,min);
    long ans=0;
    for(int i=min;i<=n;i++)
    {
      for(int j=0;j<n;j++)
      {
        int e=j+i-1;
        if(e>=n)
        break;
        int done=n-i;
        int left=k-done;
        List<Long> li=new ArrayList<>();
        long sum=0;
        for(int kk=0;kk<j;kk++)
        {
        li.add(ar[kk]);
        sum+=ar[kk];
        }
        for(int kk=e+1;kk<n;kk++)
        {
        li.add(ar[kk]);
        sum+=ar[kk];
        }
        Collections.sort(li);
        int s=0;
        while(left-->0&&s<li.size()&&li.get(s)<0)
        {
          sum-=li.get(s);
          s++;
        }
        ans=Math.max(ans,sum);
      }
    }
    System.out.println(ans);

  }
}
