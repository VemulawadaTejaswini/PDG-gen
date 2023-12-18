import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    long sum=0;
    int[] arr=new int[m];
    for(int i=0;i<m;i++)
      arr[i]=sc.nextInt();

     for(int j=0;j<m;j++)
       sum+=arr[j];
    
    long ans=n-sum;
    if(ans<0)
    System.out.println(-1);
    
    else
      System.out.println(ans);
  }
} 