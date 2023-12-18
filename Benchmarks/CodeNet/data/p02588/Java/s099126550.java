import java.io.*;
import java.util.*;
class Solution
{
  public static void main(String[] args)
  {
    double res=0;
    int count=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double arr[]=new double[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextDouble();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        res=arr[i]*arr[j];
        if(res==Math.floor(res))
        {
          count++;
        }
      }
    }
    System.out.print(count);
  }
}