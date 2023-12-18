import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextLong();
    Arrays.sort(a);
    int ans=0;
    for(int i=0;i<n-2;i++)
    {
      for(int j=i+1;j<n-1;j++)
      {
        if(a[i]==a[j])
        continue;
        int k=j+1;
        while(k<n)
        {
          if(a[k]==a[j])
          {
            k++;
            continue;
          }
          if(a[i]+a[j]>a[k])
          {
          //System.out.println(i+" "+j+" "+k);
          ans++;
          }
          else
          {
          break;
          }
          k++;
        }
      }
    }
    System.out.println(ans);
  }
}
    