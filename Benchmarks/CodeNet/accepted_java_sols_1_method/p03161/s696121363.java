import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tk;
     tk=new StringTokenizer(br.readLine());
    int n=Integer.parseInt(tk.nextToken());
    int k=Integer.parseInt(tk.nextToken());
    tk=new StringTokenizer(br.readLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=Integer.parseInt(tk.nextToken());
     }
    if(n<=2)
    {
      System.out.println(Math.abs(a[1]-a[0]));
      System.exit(0);
    }
    int prev[]=new int[n];
    prev[0]=0;
    prev[1]=Math.abs(a[1]-a[0]);
    int minCost=Integer.MAX_VALUE;
    for(int i=2;i<n;i++)
    {
      minCost=Integer.MAX_VALUE;
      for(int j=Math.max(0,i-k);j<i;j++)
      {
         if(prev[j]+Math.abs(a[i]-a[j])<=minCost)
         {
           minCost=prev[j]+Math.abs(a[i]-a[j]);
         }
         prev[i]=minCost;
        
      }
      
      
    }
    System.out.println(prev[n-1]);
    
    
    
    
  }
  
}
 