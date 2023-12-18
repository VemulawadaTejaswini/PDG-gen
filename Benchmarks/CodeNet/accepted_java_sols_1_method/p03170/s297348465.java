import java.util.*;
public class Main{
  
  public static void main(String[] args)
  {

    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    
    int dp[]=new int[k+1];
    for(int i=0;i<arr[0];i++)
    {
     dp[i]=0; 
    }
    for(int i=arr[0];i<=k;i++)
      dp[i]=-1;
    for(int i=arr[0];i<=k;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i>=arr[j])
        {
          if(dp[i-arr[j]]==0)
          {
            dp[i]=1;
            break;
          }
        }
      }
      if(dp[i]==-1)
        dp[i]=0;
     
    }
    if(dp[k]==1)
      System.out.println("First");
    else
      System.out.println("Second");
  }
}
