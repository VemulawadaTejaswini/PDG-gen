import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int m=Sc.nextInt();
    int c=Sc.nextInt();
    int a[]=new int[m];
    int b[][]=new int[n][m];
    for(int i=0;i<m;i++)
      a[i]=Sc.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        b[i][j]=Sc.nextInt();
      }
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      int sum=0;
      for(int j=0;j<m;j++)
      {
        sum=sum+(a[j]*b[i][j]);
      }
      sum=sum+c;
      if(sum>0)
        count++;
    }
    System.out.println(count);
  }
}