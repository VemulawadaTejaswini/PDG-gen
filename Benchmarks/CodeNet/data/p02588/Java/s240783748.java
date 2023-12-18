import java.util.*;
public class Solution
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
    Double d[]=new Double[n];
    for(int i=0;i<n;i++)
    {
      d[i]=s.nextDouble();
    }
    int ans=0;
    for(int i=1;i<n;i++)
    {
      for(int j=0;j<i;j++)
      {
        Double k=d[i]*d[j];
        if(Math.ceil(k) == Math.floor(k) )
        {
	  System.out.println(d[i]+" "+d[j]);
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}