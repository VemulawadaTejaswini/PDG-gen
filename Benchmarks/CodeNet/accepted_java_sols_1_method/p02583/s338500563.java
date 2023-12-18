import java.util.*;
import java.io.*;
import java.lang.*;



class Main
{
  public static void main(String[] args) {

  Scanner s=new Scanner(System.in);

  int n;
  n=s.nextInt();
  int [] a=new int[n];
  for(int i=0;i<n;i++)
  {
    a[i]=s.nextInt();
  }
    if(n<3)
    {
      System.out.println(0);
    }
    else
    {
    
    
    
  int count=0;
  for(int i=0;i<n-2;i++)
  {
    for(int j=i+1;j<n-1;j++)
    {
      for(int k=j+1;k<n;k++)
      {
        if(a[i]!=a[j] && a[j]!=a[k] && a[k]!=a[i])
        {
          if(a[i]+a[j]>a[k] && a[i]+a[k]>a[j] && a[k]+a[j]>a[i])
          {
            count++;
          }
        }
        
      }
    }
  }
  System.out.print(count);
    }













  }
}
